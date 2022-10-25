package com.bridgelabz;

public class BubbleSort {
	/*
	 * 4. Bubble Sort
     *    a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
     *    b. I/P -> read in the list ints
	 *	  c. O/P -> Print the Sorted List
	 */

	public void bubbleSort() {
		int[] a = { 9, 20, 55, 79, 44, 68, 66, 54, 35, 37, 25 };

		// for loop for printing the elements of an array
		System.out.println("Elements of array are :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}
		// nested for loop for bubble sort operation
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("\nElements of array after bubble sort is :");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + " ");
		}
	}

	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort();
	}
}
