package com.kodnest.strings.level1;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = new String(scan.nextLine());
		char[] arr = s1.toCharArray();
		System.out.println("Array of Entered String is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("========================================");
		for (char x : arr) {
			System.out.println(x);
		}
	}
}
