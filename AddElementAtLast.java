package com;

import java.util.Scanner;

public class AddElementAtLast {
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
		int a[] = new int[size + 1];
		for (int i = 0; i < array.length; i++) {
			a[i + 1] = array[i];
		}
		a[0] = element;
		for (int i = 0; i < a.length; i++) {
			System.err.println(a[i]);
		}
	}
}
