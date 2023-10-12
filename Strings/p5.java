package com.kodnest.strings.level1;

public class p5 {

	public static void main(String[] args) {
		int numAlphabets = 26;
		char currentChar = 'A';

		for (int i = 0; i < numAlphabets; i++) {
			System.out.print(currentChar);

			char lowercaseChar = (char) (currentChar + 32);
			System.out.print(lowercaseChar);

			currentChar = (char) (currentChar + 1);
		}

		System.out.println();

	}
}
