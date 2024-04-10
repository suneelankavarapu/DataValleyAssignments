package com.assignment2;

import java.util.Scanner;

public class OddPositionCharacter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printOddPositionCharacter(str);
	}

	private static void printOddPositionCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (((i + 1) & 1) == 1) {
				if (str.charAt(i) != ' ') {
					System.out.print(str.charAt(i) + " ");
				}
			}
				
		}
		
	}

}
