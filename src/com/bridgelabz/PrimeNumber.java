package com.bridgelabz;

public class PrimeNumber {
//Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
	public static boolean isPrime(int n) {
		if (n < 2)			// if n is less than 2 it will return false
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int lower = 0;
		int upper = 1000;
		System.out.println("Prime numbers between 0 to 1000 are "); // printing prime numbers till 1000
		for (int i = lower; i <= upper; i++)
			if (isPrime(i))
				System.out.println(i);
	}
}
