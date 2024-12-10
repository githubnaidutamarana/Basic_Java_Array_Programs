package org;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int size = scanner.nextInt();
		System.out.println("Enter the Elements : ");
		int array[] = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		Set<Integer> var1 = new HashSet<>();
		for (int i : array) {
			var1.add(i);
		}
		System.out.println(var1);
	}

}
