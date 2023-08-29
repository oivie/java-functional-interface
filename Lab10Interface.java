package com.humber.labs;

public class Lab10Interface {
	    public static void main(String[] args) {
	        // Create a lambda expression using the functional interface
	        CustomFunction customFunction = (a, b) -> a + Integer.parseInt(b) * 3;

	        // Call the lambda expression with input values
	        int result = customFunction.performOperation(1, "3");

	        // Display the result
	        System.out.println("Result: " + result);
	    }
}
