package com.corejavapractice;

import java.util.Scanner;

public class NumberTabel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int result = 0;
		System.out.println("\n"+n+" Table ->\n");
		for(int i = 1; i <= 10; i++) {
			result = n*i;
			System.out.println(n+" x "+i+" = "+result);
		}

		
	}

}
