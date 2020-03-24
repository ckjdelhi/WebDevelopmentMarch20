package com.basic;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Account Information System***");
		System.out.println("Select one option below");
		System.out.println("1 Add record to file");
		System.out.println("2 Show record from file");
		System.out.println("3 Search record from file");
		System.out.println("4 Update record");
		System.out.println("5 Delete record");
		System.out.println("6 Quite");
		System.out.println("Enter your choice");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println(" Enter  Name \n Enter Account number \n Enter Balance");
			break;
		case 2:
			System.out.println(" Enter  Name");
			break;
		case 3:
			System.out.println(" Enter  name to search");
			break;
		case 4:
			System.out.println(" Enter file name to Update");
			break;
		case 5:
			System.out.println(" Enter file name to delete");
			break;
		default:
			System.out.println(" Match not found");
		}
		sc.close();
	}

}
