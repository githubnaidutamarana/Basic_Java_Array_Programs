package com;

import java.util.Scanner;

public class AddElementAtSpecifiedPosition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array...");
		int size = scanner.nextInt();

		System.out.println("Enter the Elements...");
		int array[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter insert Element...");
		int element = scanner.nextInt();
		System.out.println("Enter the Index Position...");
		int index = scanner.nextInt();
		int a[] = new int[size + 1];

		for (int i = 0; i < a.length; i++) {

			if (index > i) {
				a[i] = array[i];
			} else if (index == i) {
				a[i] = element;
			} else {
				a[i] = array[i-1];
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.err.println(a[i]);
		}
	}
}
