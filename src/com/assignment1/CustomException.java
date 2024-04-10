package com.assignment1;

import java.util.Scanner;

class CustomValidationException extends Exception {
	
	public CustomValidationException(String str) {
		super(str);
	}
	
}
public class CustomException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		if (value < 0) {
			try {
				throw new CustomValidationException("Value is negative");
			} catch (CustomValidationException e) {
				System.out.println(e);
			}	
		} else 
			System.out.println("Valid value is given.");
	}

}
