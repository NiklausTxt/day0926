package com.day0926.practice2;

public class Test2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
//		System.out.println(Calculate(40));
		long end = System.currentTimeMillis();
		long t = end-start;
		System.out.println((1<<3)|(1<<2));
	}

	public static long Calculate(long num) {
		if (num == 1) {
			return 3;
		} else if (num == 2) {
			return 9;
		} else {
			return 2 * Calculate(num - 1) + Calculate(num - 2);
		}
	}

}