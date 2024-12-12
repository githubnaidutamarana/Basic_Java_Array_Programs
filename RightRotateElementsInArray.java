package com;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateElementsInArray {
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
		int rightShift = scanner.nextInt();

		for (int i = 0; i < rightShift; i++) {

			int last = array[array.length - 1];
			for (int j = array.length - 1; j > 0; j--) {
				array[j] = array[j - 1];
			}
			array[0] = last;
		}
		System.err.println(Arrays.toString(array));
	}
}
