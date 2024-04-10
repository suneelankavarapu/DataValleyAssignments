package com.assignment2;

import java.util.Scanner;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = getSum(arr);
		System.out.println(sum);
	}

	private static int getSum(int[] arr) {
		int sum = 0;
		for (int value : arr) {
			if (value % 5 == 0 && value % 2 == 0)
				sum += value;
		}
		return sum;
	}

}
