package com;

import java.util.Scanner;

public class FrequencyOfElements {
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
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
			}
			boolean isPreviouslyPresent = false;
			for (int k = i + 1; k < array.length; k++) {
				if (array[i] == array[k]) {
					isPreviouslyPresent = true;
					break;
				}
			}

			if (isPreviouslyPresent == false) {
				System.err.println(array[i] + "--->" + count);
			}

		}
	}
}
