package com;

import java.util.Scanner;

public class EvenElementsInArray {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array...");
		int size = scanner.nextInt();

		System.out.println("Enter the Elements...");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.err.println(array[i]);
			}
		}

	}
}
