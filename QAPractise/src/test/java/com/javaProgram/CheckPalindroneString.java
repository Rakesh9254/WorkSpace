package com.javaProgram;


public class CheckPalindroneString {
	public static boolean isPalindrome(String str) {
	    String reversed = reverseString(str); // You can reuse the reverseString function from question 1.
	    return str.equals(reversed);
	}


	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		return null;
	}


	public static void main(String[] args) {
		String str = "RaR";
		System.out.println(isPalindrome(str));
	}
}
