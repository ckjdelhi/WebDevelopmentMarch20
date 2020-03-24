package com.basic;

import java.util.Scanner;

public class MultiplicationTableDemo {

	public static void main(String[] args) {
	/*
	 * Enter number: 3
	 * 3 x 1 = 3    num x i = (num*i)
	 * 3 x 2 = 6
	 * 3 x 3 = 9
	 * ...
	 * ...
	 * 3 x 10 = 30
	 */
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number: ");
	int num=sc.nextInt();
	for(int i=1; i<=10;i++) {
		System.out.println(num +" x "+ i +" = "+ (num*i));
	}
 }
}
