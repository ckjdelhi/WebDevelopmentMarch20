package com.designPattern.singleton;

public class Test {

	public static void main(String[] args) {
		SingletonDemo obj1 = SingletonDemo.getInstance();
		obj1.show();
		
		
		SingletonDemo obj2= SingletonDemo.getInstance();
		obj2.show();
		
		if(obj1 == obj2) {
			System.out.println("same object");
		}else {
			System.out.println("different object");
		}
	}

}
