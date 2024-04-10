package com.assignment1;
import java.util.Scanner;
public class ReplaceCharacter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char newChar = sc.next().charAt(0);
		int index = sc.nextInt();
		char oldChar = str.charAt(index);
		
		String ans = replaceChar(str, oldChar, newChar);
		System.out.println(ans);
	}

	private static String replaceChar(String str, char oldChar, char newChar) {
		return str.replace(oldChar, newChar);
	}

}
