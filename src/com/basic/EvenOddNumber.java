package com.basic;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		//Way-1
		if(num % 2 == 0) {
			System.out.println(num +" is Even Number");
		}else {
			System.out.println(num +" is Odd Number");
		}
		//Way-2
		if((num / 2)*2 == num) {
			System.out.println(num +" is Even Number");
		}else {
			System.out.println(num +" is Odd Number");
		}
		
		//Way-3
		if((num & 1) == 0) {
			System.out.println(num +" is Even Number");
		}else {
			System.out.println(num +" is Odd Number");
		}
	}

}
