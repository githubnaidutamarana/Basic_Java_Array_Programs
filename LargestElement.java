package com;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array...");
		int size = scanner.nextInt();

		System.out.println("Enter the Elements...");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		int largest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (largest < array[i]) {
				largest = array[i];
			}
		}
		System.err.println(largest);

	}
}
