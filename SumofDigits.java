package com.corejavapractice;

import java.util.*;

public class SumofDigits {

	public static void main(String[] args) {
		twoDigits();
		threeDigit();
		fourDigit();

	}
	static void twoDigits() {
		Scanner an = new Scanner(System.in);
		System.out.print("Enter Two Digits : ");
		int a = an.nextInt();
		int b = a%10+a/10;
		System.out.println("Sum of Two Digits : "+b+"\n");
		
		
	}
	static void threeDigit(){
		Scanner an = new Scanner(System.in);
		System.out.print("Enter Three Digits : ");
		int f = an.nextInt();
		int a = f % 100;
		int b = a % 10 + a / 10;
		int sum = ((f / 100) + b);
		System.out.println("Sum of Three Digits : " + sum+"\n");
	}
	static void fourDigit() {
		Scanner ne = new Scanner(System.in);
		System.out.print("Enter Four Digits : ");
		int g = ne.nextInt();
		int p = g % 1000;
		int q = p % 100;
		int r = q % 10 + q / 10;
		int s = p / 100 + g / 1000 + r;
		System.out.println("Sum of Four Digits : "+s);
	}

}
