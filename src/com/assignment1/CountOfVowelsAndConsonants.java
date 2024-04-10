package com.assignment1;

import java.util.Scanner;

public class CountOfVowelsAndConsonants {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int vowels = getCountOfVowels(str);
		int consonants = getCountOfConsonants(str);
		
		System.out.println("Vowels Count: " + vowels);
		System.out.println("Consonants Count: " + consonants);
	}

	private static int getCountOfConsonants(String str) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
					ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')
				count++;
		}
		return count;
	}

	private static int getCountOfVowels(String str) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
					ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				count++;
		}
		return count;
	}

}
