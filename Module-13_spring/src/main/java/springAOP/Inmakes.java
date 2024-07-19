package springAOP;

import org.springframework.stereotype.Component;

@Component
public class Inmakes {
	
	public void displayCourse(String course,double price) {
		
		System.out.println("displaying all the courses="+course+" price="+price);//Business logic
	}
	
	public void displaysecurity() {
		
		System.out.println("security invoking..");
	}
	
	public int getamount(int amount) {
		
		return amount;
	}

}
