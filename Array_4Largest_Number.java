package com.arrays;

import java.util.Scanner;

public class Array_4Largest_Number {
	{
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		System.out.println("Enter 5 Array Numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int ln = 0, sn = 0, tn = 0, fn = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ln) {
				fn = tn;
				tn = sn;
				sn = ln;
				ln = arr[i];
			} 
			else if (arr[i] > sn && arr[i] != ln) {
				fn = tn;
				tn = sn;
				sn = arr[i];
			}
			else if (arr[i] > tn && arr[i] != sn) {
				fn = tn;
				tn = arr[i];
			} 
			else if (arr[i] > fn && arr[i] != tn) {
				fn = arr[i];
			}
		}
		System.out.println("First Lagest Number   : " + ln);
		System.out.println("Second Largest Number : " + sn);
		System.out.println("Third Largest Number  : " + tn);
		System.out.println("Fourth Largest Number : " + fn);
	}

	public static void main(String[] args) {

		Array_4Largest_Number aln = new Array_4Largest_Number();
	}

}
