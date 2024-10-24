package com;

import java.util.Scanner;

public class CommonElementsInTwoArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// First Array
		System.out.println("Enter the size of first Array...");
		int size1 = scanner.nextInt();

		System.out.println("Enter the Elements of first Array...");
		int array1[] = new int[size1];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = scanner.nextInt();
		}
		//Second Array		
		System.out.println("Enter the size of second Array...");
		int size2 = scanner.nextInt();

		System.out.println("Enter the Elements of second Array...");
		int array2[] = new int[size2];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = scanner.nextInt();
		}

		int array3[] = new int[array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			array3[array1.length + i] = array2[i];
		}

		for (int i = 0; i < array3.length; i++) {

			for (int j = i + 1; j < array3.length; j++) {
				if (array3[i] == array3[j]) {
					System.err.println(array3[i]);
				}
			}
		}
	}
}
