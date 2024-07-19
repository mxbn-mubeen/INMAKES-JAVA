package com.collectionmethod;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapinterface {

	public static void main(String[] args) {
		// map interface - collection of keys and value
		/*methods:
		 * public void put(K,V);
		 *public object get (object key) 
		 * public set<k> keyset()
		 * public set<entry<k,v>>entry set()
		 */
		
		System.out.println("___________using hashmap________________");
		
		Map<String, Integer> a1=new HashMap<String, Integer>(); // random order
		
		a1.put("java", 25);
		a1.put("andriod", 45);
		a1.put("asp", 56);
		a1.put("php", 2);
		a1.put("sql", 8);
		
		System.out.println("a1="+a1);
		
		System.out.println("___________get method________________");
		
		System.out.println(a1.get("java"));
		
		System.out.println("___________using linkedhashmap________________");
		
		Map<String, Integer> a2=new LinkedHashMap<String, Integer>();//insertion order
		
		a2.put("java", 25);
		a2.put("andriod", 45);
		a2.put("asp", 56);
		a2.put("php", 2);
		a2.put("sql", 8);
		
		System.out.println("a2="+a2);
		
		System.out.println("___________keyset1________________");
		
		Iterator<String> itr=a2.keySet().iterator();
		
		/*while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		
		while(itr.hasNext()) {
			String key=itr.next();
			System.out.println(key+"->"+a2.get(key));
		}
		
		System.out.println("___________value method________________");
		
		Iterator itr2=a2.values().iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("___________entryset________________");
		
		for(Map.Entry<String, Integer> a: a2.entrySet()) {
			System.out.println(a.getKey()+"="+a.getValue());
		}
		
		System.out.println("___________using treemap________________");
		
		Map<String, Integer> a3=new TreeMap<String, Integer>();//ascending order or natural order [comparator interface]
		a3.put("java", 25);
		a3.put("andriod", 45);
		a3.put("asp", 56);
		a3.put("php", 2);
		a3.put("sql", 8);
		
		System.out.println("a3="+a3);
		
		System.out.println("___________using hashtable________________");
		
		Hashtable<String, Integer> a4=new Hashtable<String, Integer>(); // random order
		
		a4.put("java", 25);
		a4.put("andriod", 45);
		a4.put("asp", 56);
		a4.put("php", 2);
		a4.put("sql", 8);
		
		
		System.out.println("print hashtable");
		System.out.println("a4="+a4);

	}

}
