package com.basic;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("First number is largest");
		}else if(b>a && b>c) {
			System.out.println("Second number is largest");
		}else {
			System.out.println("Third number is largest");
		}
	}

}
