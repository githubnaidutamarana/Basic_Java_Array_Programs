package com;

import java.util.Scanner;

public class SmallestElement {
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
		for (int i = 0; i < array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];
			}
		}
		System.err.println(smallest);
	}
}
