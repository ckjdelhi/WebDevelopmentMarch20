package com.designPattern.singleton;

/*
 * Singleton Design Pattern
 * 1. Eager loading(Early binding)
 * > add private default constructor
 * > add private static class variable
 * > create object in static block
 * > create public static getInstance method and return obj
 * 
 * 2. Lazy loading (Late binding)
 * > add private default constructor
 * > add private static class variable and initialize with null
 * > create public static getInstance method 
 * > and check if object is null and then initialize object
 */
public class SingletonDemo {
	/*private SingletonDemo() {}
	private static SingletonDemo instance;
	static {
		instance=new SingletonDemo();
	}
	
	public static SingletonDemo getInstance() {
		return instance;
	}*/
	
	private SingletonDemo() {}
	private static SingletonDemo instance=null;
	public static SingletonDemo getInstance() {
		synchronized (SingletonDemo.class) {
			if(instance ==null) {
				synchronized (SingletonDemo.class) {
					instance=new SingletonDemo();
				}
			}
		}
		return instance;
	}
	
	void show() {
		System.out.println("Show");
	}
}
