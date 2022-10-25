package com.bridgelabz;

public class MergeSort {

/*
 * 5. Merge Sort - Write a program to do Merge Sort of list of Strings.
 *		a. Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves
 *					independently, and then merge the results to sort the full array. To sort a[lo, hi),
 *					we use the following recursive strategy:
 *		b. Base case: If the subarray length is 0 or 1, it is already sorted.
 *		c. Reduction step: Otherwise, compute mid = lo + (hi - lo) / 2, recursively sort the
 *					two subarrays a[lo, mid) and a[mid, hi), and merge them to produce a sorted
 *					result.
 */
    public void displayArray(int arr[], int n){
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    /*
     * Divie array to sub arrays and merge to function
     */
    public void splitAndMerge(int arr[], int low, int high){
        if (low<high){
            int mid = (low+high) / 2;
            splitAndMerge(arr, low, mid);
            splitAndMerge(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    /*
     * merge divided arrays to function
     */
    public void merge(int arr[], int low, int mid, int high){
        int i = low, h = low, j = mid+1, k, temp[] = new int[10];
        while (h<=mid && j<=high){
            if (arr[h] <= arr[j]){
                temp[i] = arr[h];
                h++;
            }else {
                temp[i] = arr[j];
                j++;
            }
            i++;
        }
        if (h>mid){
            for (k=j; k<=high; k++){
                temp[i] = arr[k];
                i++;
            }
        }else {
            for (k=h; k<= mid; k++){
                temp[i] = arr[k];
                i++;
            }
        }
        for (k=low; k<=high; k++){
            arr[k] = temp[k];
        }
    }
    public static void main(String[] args)
    {
        MergeSort mergSort = new MergeSort();
        int arr[] = {48, 93, 28, 44, 1, 0, -1, 3};
        int len = arr.length;
        System.out.println("Before MergeSort the array elements : ");
        mergSort.displayArray(arr, len);
        /*
         * Dividing array to sub arrays
         */
        mergSort.splitAndMerge(arr, 0, len-1);
        System.out.println("After MergeSort the array elements : ");
        mergSort.displayArray(arr, len);

    }
}
