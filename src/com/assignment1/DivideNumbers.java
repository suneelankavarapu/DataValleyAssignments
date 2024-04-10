package com.assignment1;

import java.util.Scanner;

public class DivideNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerator = sc.nextInt();
		int denomirator = sc.nextInt();
		divideNumbers(numerator, denomirator);
	}

	private static void divideNumbers(int numerator, int denomirator) {
		try {
			int ans = numerator / denomirator;
			System.out.println(ans);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}

}
