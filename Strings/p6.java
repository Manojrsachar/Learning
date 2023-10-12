package com.kodnest.strings.level1;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scanner.nextLine();
		char arr1[] = str.toCharArray();
		char arr2[] = new char[arr1.length];
		// copy spaces from arr1 to arr2
		for (int i = 0; i <= arr1.length - 1; i++) {
			if (arr1[i] == ' ') {
				arr2[i] = arr1[i];
			}
		}
		int j = arr2.length - 1;
		for (int i = 0; i <= arr1.length - 1; i++) {
			if (arr1[i] != ' ') {
				if (arr2[j] == ' ') {
					j--;
				}
				arr2[j] = arr1[i];
				j--;
			}
		}
		str = new String(arr2);
		System.out.println(str);
		scanner.close();
	}
}
