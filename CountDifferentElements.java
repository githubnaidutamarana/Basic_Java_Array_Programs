package com;

import java.util.Scanner;

public class CountDifferentElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array...");
		int size = scanner.nextInt();

		System.out.println("Enter the Elements...");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int count = 0;
		for (int i = 0; i < array.length; i++) {

			boolean isPreviouslyPresent = false;
			for (int j = 0; j < i - 1; j++) {
				if (array[i] == array[j]) {
					isPreviouslyPresent = true;
				}
			}
			if (isPreviouslyPresent == false) {
				count++;
			}
		}
		System.err.println(count);

	}
}
