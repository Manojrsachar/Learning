package com.kodnest.strings.level1;

public class p3 {

	public static void main(String[] args) {
		String s1 = "java full stack development";
		char [] arr = s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || i == 5 || i == 10 || i == 16) {
				System.out.print(Character.toUpperCase(arr[i]));
			} else {
				System.out.print(arr[i]);
			}
		}
	}
}
