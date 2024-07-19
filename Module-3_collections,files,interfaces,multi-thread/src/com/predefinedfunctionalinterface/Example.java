package com.predefinedfunctionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Example {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1001,"Anand","nw enginner",55000);
		Employee e2=new Employee(1002,"Aksah","sw enginner",65000);
		Employee e3=new Employee(1003,"rathish","DB enginner",155000);
		Employee e4=new Employee(1004,"sam","tech",55000);
		Employee e5=new Employee(1005,"Anandhi","net ",55000);

		List<Employee> emplist=new ArrayList<Employee>();
		
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		
		//System.out.println(emplist);
		
		/*for(int i=0;i<emplist.size();i++) {
			
			System.out.println(emplist.get(i));
		}*/
		
		/*emplist.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee t) {
				System.out.println(t);
				
			}
		});*/
		
		System.out.println("-------------------------using consumer interface-----------------------------------------");
		
		
		emplist.forEach((e)-> System.out.println(e));;
		
		System.out.println("---------------------------------------------------------------------------");
		
		emplist.forEach(System.out::println);
		
		System.out.println("-------------------------------using predicate interface-------------------------------");
		
		
		emplist.stream().filter(e->e.designation.contains("enginner")).forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------------------------");
		
		emplist.stream().filter(e->e.salary>=100000).forEach(x->System.out.println(x));
		
		System.out.println("----------------------------------using function interface-----------------------------");
		
		emplist.stream().map(e->e.empname.toUpperCase()).forEach(x->System.out.println(x));
		
		System.out.println("---------------------------------------------------------------------------");
		
		emplist.stream().map(e->e.empname.length()).forEach(x->System.out.println(x));
		
		System.out.println("---------------------------------------------------------------------------");
		
		emplist.stream().map(new Function<Employee,Integer>() {
			
			public Integer apply(Employee t) {
				return t.empname.length();
			}
		});
	}

}
