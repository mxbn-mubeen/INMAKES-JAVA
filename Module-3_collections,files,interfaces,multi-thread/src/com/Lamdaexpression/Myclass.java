package com.Lamdaexpression;

public class Myclass {
	public static void main(String[] args) {
		
	/*	Myinterface obj=new Myclass();//upcasting
		obj.Show();
	}

	@Override
	public void Show() {
		System.out.println("Myinterface is the functional interface");
		
	}*/
		
		
	/*	Myinterface obj=new Myinterface() {
			//anonymous innerclass
			@Override
			public void Show() {
				System.out.println("Myinterface is the functional interface");
				
			};
		};
		
	
		obj.Show();
		
		*/
		
		
		/*Myinterface obj=()->System.out.println("this is example of Lamda expression"); 
		 obj.Show();//calling method*/
		
		/*Myinterface obj=()->{System.out.println("this is example of Lamda expression");};
		obj.Show();//calling method */
		
		
		/*Myinterface obj=(s1,s2)->{System.out.println("Message="+s1+" Message="+s2);};
		obj.Show("welcome","Good bye");//calling method*/
		
		
		/*Myinterface obj=(s1,x)->{System.out.println("Message="+s1+" Integer value="+x);};
		obj.Show("welcome",10);*/
		
		/*Myinterface obj=(x,a)->{System.out.println("double value="+x+" Integer value="+a);};
		obj.Show(2.8,10);*/
		
		/*Myinterface obj=(x,a)->{System.out.println("double value="+x+" Integer value="+a);};
		obj.Show(2,10);*/
		
		Myinterface obj=(x,a)->{return(x+a);};
		double result=obj.add(2.8,10);
		System.out.println("Result="+result);
	
	}
}
