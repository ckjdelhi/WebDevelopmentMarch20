package com.basic;

/**
 * Variables:
 * 1. Local Variable : declared within method, it should always initialized
 * 2. Global Variable: which declared outside of method
 * 		1. static variable : it is a property of class
 * 		2. instance variable
 *
 */

public class StaticDemo {
	static double salary=3000; //static variable
	String name="abc"; //instance variable
	
	public static void main(String []arg) {
		int age=20;//local variable
		System.out.println(salary);
		StaticDemo obj=new StaticDemo();
		System.out.println(obj.name);
		display();
		obj.show();
	}
	
	void show() {
		System.out.println("hi1");
	}
	
	static void display() {
		System.out.println("hi");
	}
}
