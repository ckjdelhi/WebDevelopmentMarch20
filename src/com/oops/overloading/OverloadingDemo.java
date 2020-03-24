package com.oops.overloading;

class Test{
	
	public Test() {
		this(20,30);
		System.out.println("const-1");
	}
	public Test(int a) {
		this();
		System.out.println("const-2");
	}
	
	public Test(int a, int b) {
		System.out.println("const-3");
	}
	
	void show(long a, int b) {
		System.out.println("show-1");
	}
	void show(int a, long b) {
		System.out.println("show-2");
	}
}


public class OverloadingDemo {

	public static void main(String[] args) {
		Test obj=new Test(200);
		obj.show(20L,20);
		obj.show(20,20L);
	}

}
