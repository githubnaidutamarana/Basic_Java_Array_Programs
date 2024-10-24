package com;

import java.util.Scanner;

public class SecondHalfOfAnArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array...");
		int size = scanner.nextInt();

		System.out.println("Enter the Elements...");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = array.length / 2; i < array.length; i++) {
			System.err.println(array[i]);
		}

		
	}
}
