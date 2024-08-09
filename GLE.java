package com.corejavapractice;

import java.util.Scanner;

public class GLE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("X : ");
		int x = sc.nextInt();
		System.out.print( "Y : ");
		int y = sc.nextInt();
		
		if(x>y) {
			System.out.println("X is Greater than Y");
		}
		else if (x<y) {
			System.out.println("X is Less than Y");
		}
		else if(x==y) {
			System.out.println("X is Equal than Y");
		}
		else {
			System.out.println("Invalid");
		}

	}

}
