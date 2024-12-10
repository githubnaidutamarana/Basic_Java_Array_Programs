package com;

import java.util.Arrays;

public class TwoWayMergeSorting {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 2, 7, 9 };
		int b[] = { 12, 14, 4, 6, 8, 10, 11 };

		Arrays.sort(a);
		Arrays.sort(b);

		int c[] = mergeSort(a, b);

		System.out.println(Arrays.toString(c));
	}

	public static int[] mergeSort(int a[], int b[]) {
		int m = a.length;
		int n = b.length;
		int c[] = new int[m + n];

		int i = 0, j = 0, k = 0;
		while (i < m && j < n) {
			if (a[i] <= b[j]) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}
		while (i < m) {
			c[k++] = a[i++];
		}
		while (j < n) {
			c[k++] = b[j++];
		}
		return c;
	}
}
