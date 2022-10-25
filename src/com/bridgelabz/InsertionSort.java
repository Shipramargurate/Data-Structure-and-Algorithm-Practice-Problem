package com.bridgelabz;

public class InsertionSort {
	/*
	 * 3. Insertion Sort
	 *		a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
	 *		b. I/P -> read in the list words
	 *		c. Logic -> Use Insertion Sort to sort the words in the String array
	 * 		d. O/P -> Print the Sorted List
	 */
	public void sort(String[] arr) {
		for (int i = 1; i < arr.length; ++i) {
			String key = arr[i];
			int j = i - 1;
			while (j >= 0 && key.length() < arr[j].length()) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		InsertionSort ob = new InsertionSort();
		String[] arr = { "Somiya", "is", "a", "good", "Girl" };
		System.out.println("Before:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nAfter: ");
		ob.sort(arr);
	}
}