package com.bridgelabz;

import java.util.*;

public class BinaryTree {
	static Scanner sc = new Scanner(System.in);

	int Search(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x) // element is present at the mid
			{
				return mid;
			}
			//  If element is smaller than mid, then it is present in left subarray
			if (arr[mid] > x)
				return Search(arr, l, mid - 1, x);
			else
				return Search(arr, mid + 1, r, x); // element present in right subarray
		}

		return -1; // element is not present
	}

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements of binary tree");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("elemets are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("enter value for x");
		int x = sc.nextInt();
		int result = bTree.Search(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index " + result);
	}

}