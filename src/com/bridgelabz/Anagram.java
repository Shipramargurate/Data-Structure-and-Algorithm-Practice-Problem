package com.bridgelabz;

import java.util.*;
/*
 * 6. An Anagram Detection Example
 *  	a. Desc -> One string is an anagram of another if the second is simply 
 *			    	a rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
 *		b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
 *		c. O/P -> The Two Strings are Anagram or not....
 */
public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// taking two strings for two words
		System.out.println("Enter the first word");
		String str1 = sc.nextLine();
		System.out.println("Enter the second word");
		String str2 = sc.nextLine();
		// lower case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		// Checking length of two string
		if (str1.length() == str2.length()) {
			// if length are same this block willl execute
			// convert string into char array
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			// if sorted array is same, string is anagram
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			// checking two are same or not if true if block will execute or else will
			boolean result = Arrays.equals(charArray1, charArray2);
			if (result) {
				System.out.println(str1 + "  and  " + str2 + " are anagram");
			} else {
				System.out.println(str1 + "   and  " + str2 + "  not anagram");
			}
		} else {
			// if length of two string not equal this block will execute
			System.out.println("invalid word");
		}
		sc.close();
	}
}