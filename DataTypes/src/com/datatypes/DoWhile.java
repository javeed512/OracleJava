package com.datatypes;

public class DoWhile {

	public static void main(String[] args) {


		boolean isValidUser = false;
		
		
		do {
			
			System.out.println("Show Login Page");
			
			if(isValidUser) {
				
				System.out.println("Welcome to Home page");
				
				isValidUser = false;
				
			}
			
			
		} while (isValidUser);

	}

}
