package com.java;

public class Exceptionhandling {

	public static void main(String[] args) 
	
	{
		try {
			
			System.out.println(10/0);
			
		} 
		catch (ArithmeticException ae) {
			System.out.println("This is Arithmatic");


		}
		catch (Exception e) {
			System.out.println("This is Parent Exception and is handeling the error " + e);
			
			System.out.println("Inside catch");

		}
		finally {
			System.out.println("I want to release all resources");
		}
		
		System.out.println("Finished");

	}

}
