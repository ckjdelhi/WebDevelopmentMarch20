package com.basic;
/*
 * Constructor: 
 * it doesn't have any return type
 * it should be public
 * name should be as class name
 */
//static block -> main -> init block -> constructor -> normal method
public class StaticBlock {
	public StaticBlock() {
		System.out.println("C-1");
	}
	
	static {
		System.out.println("s-1");
	}
	
	{
		System.out.println("I-1");
	}
	
	{
		System.out.println("I-2");
	}
	public static void main(String[] args) {
		System.out.println("main");
		StaticBlock obj=new StaticBlock();
		obj.show();
		StaticBlock obj2=new StaticBlock();
		obj2.show();
	}
	static {
		System.out.println("s-2");
	}
	
	void show() {
		System.out.println("show");
	}
}
