package org;

import java.util.Scanner;

public class PlaindromeWords {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String...");
		String str = scanner.nextLine();
		String[] word = str.split(" ");

		for (String words : word) {
			if (isPalindrome(words)) {
				System.out.println(words);
			}
		}
	}
	public static boolean isPalindrome(String word) {

		int i = 0;
		int j = word.length() - 1;

		while (j >= i) {

			if (word.charAt(i) != word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
