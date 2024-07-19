package com.Methodreference;

public class NonStaticReference {

    public static void main(String[] args) {
        // Create an instance of NonStaticReference
        NonStaticReference obj1 = new NonStaticReference();

        // Implement the NonStaticInterface using a lambda expression
        //NonStaticInterface obj2 = (x, y) -> obj1.m1(x, y);

        NonStaticInterface obj2=obj1::m1;
        // Call the add method through the interface implementation
        double result1 = obj2.add(2.8, 10);
        System.out.println("result = " + result1);
    }

    // Non-static method to be referenced
    double m1(double x, int y) {
        System.out.println("method reference to non-static method");
        return (x + y);
    }
}
