package com.codingchallenge4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1 {
    private int id;
    private String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

class Employee1IdComparator implements Comparator<Employee1> {
    @Override
    public int compare(Employee1 emp1, Employee1 emp2) {
        return Integer.compare(emp1.getId(), emp2.getId());
    }
}

	public class SortArrayListUsingComparator {
	    public static void main(String[] args) {
	     
	        ArrayList<Employee1> employees = new ArrayList<>();
	        employees.add(new Employee1(101, "John"));
	        employees.add(new Employee1(103, "Alice"));
	        employees.add(new Employee1(102, "Bob"));
	
	        System.out.println("Unsorted ArrayList:");
	        System.out.println(employees);
	
	        Collections.sort(employees, new Employee1IdComparator());
	
	        System.out.println("\nSorted ArrayList by ID:");
	        System.out.println(employees);
	    }
}
