package com;

import java.util.Scanner;

public class SecondLargestElement {
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
		int secondLargest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (largest < array[i]) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest && array[i] != largest) {
				secondLargest = array[i];
			}
		}
		System.err.println("Largest Element : " + largest);
		System.err.println("Second Largest Element : " + secondLargest);
	}
}
