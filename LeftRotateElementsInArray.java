package com;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateElementsInArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array...");
		int size = scanner.nextInt();

		System.out.println("Enter the Elements...");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		System.out.println("Enter the Shifting Number : ");
		int leftShift = scanner.nextInt();
		for (int i = 0; i < leftShift; i++) {
			int first = array[0];

			for (int j = 1; j < array.length; j++) {
				array[j - 1] = array[j];
			}
			array[array.length - 1] = first;
		}
		System.err.println(Arrays.toString(array));
	}
}
