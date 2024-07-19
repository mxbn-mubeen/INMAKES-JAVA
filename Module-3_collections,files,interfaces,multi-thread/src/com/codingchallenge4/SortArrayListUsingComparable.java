package com.codingchallenge4;
import java.util.ArrayList;
import java.util.Collections;


class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name) {
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
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

	public class SortArrayListUsingComparable {
	    public static void main(String[] args) {
	      
	        ArrayList<Employee> employees = new ArrayList<>();
	        employees.add(new Employee(101, "John"));
	        employees.add(new Employee(103, "Alice"));
	        employees.add(new Employee(102, "Bob"));
	
	        System.out.println("Unsorted ArrayList:");
	        System.out.println(employees);
	
	        Collections.sort(employees);
	
	        System.out.println("\nSorted ArrayList by ID:");
	        System.out.println(employees);
	    }
}
