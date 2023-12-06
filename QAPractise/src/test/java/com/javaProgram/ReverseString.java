package com.javaProgram;

public class ReverseString {

	static String reverseString(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String string = "Rakesh";
		System.out.println(reverseString(string));
	}

}
