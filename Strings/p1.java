package com.kodnest.strings.level1;

public class p1 {

	public static void main(String[] args) {
		System.out.println("length()>>>");
		String s1 = new String("KodNest ");
		int stringSize = s1.length();
		System.out.println(stringSize);
		System.out.println("===========================================");

		System.out.println("trim()>>>");
		String s2 = new String("Technologies ");
		String s3 = new String("private ");
		String s4 = new String("limited ");
		System.out.println(s1.trim() + s2.trim() + s3.trim() + s4.trim());
		System.out.println("===========================================");

		System.out.println("replace()>>>");
		String replaced = s1.replace("KodNest", "KODNEST");
		System.out.println(replaced);
		System.out.println("===========================================");

		System.out.println("replaceAll()>>>");
		String s5 = new String("Web Developer");
		String s6 = new String("Android Developer");
		System.out.println(s5);
		System.out.println(s5.replaceAll(s5, s6));
		System.out.println("===========================================");

		System.out.println("toCharArray()>>>");
		String s7 = "Java Full stack Development";
		char[] arr = s7.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);// horizontal
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);// vertical
		}
		System.out.println("===========================================");

		System.out.println("startsWith()>>>");
		String s8 = "Developer";
		System.out.println(s8.startsWith("Dev"));// true
		System.out.println(s8.startsWith("per"));// false
		System.out.println("===========================================");

		System.out.println("endsWith()>>>");
		System.out.println(s8.endsWith("D"));// false
		System.out.println(s8.endsWith("r"));// true
		System.out.println("===========================================");

	}

}
