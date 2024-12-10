package com;

import java.util.Arrays;

public class BubbleSortArray {
	public static void main(String[] args) {

		int a[] = { 2, 5, 1, 3, 8, 6 };
		System.out.println("Array before Sorting : " + Arrays.toString(a));

		int n = a.length;

		for (int i = 0; i < n - 1; i++) { // Number of passes
			for (int j = 0; j < n - 1; j++) { // Number of iterations
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.err.println("Array After Sorting : " + Arrays.toString(a));
	}
}
