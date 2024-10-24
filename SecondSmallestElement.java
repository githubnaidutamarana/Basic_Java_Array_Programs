package com;

import java.util.Scanner;

public class SecondSmallestElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array...");
		int size = scanner.nextInt();

		System.out.println("Enter the Elements...");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		int smallest = array.length;
		int secondSmallest = array.length;

		for (int i = 0; i < array.length; i++) {
			if (smallest > array[i]) {
				secondSmallest = smallest;
				smallest = array[i];
			} else if (array[i] < secondSmallest && array[i] != smallest) {
				secondSmallest = array[i];
			}
		}
		System.err.println("Smallest Element : " + smallest);
		System.err.println("Second Smallest Element : " + secondSmallest);

	}
}
