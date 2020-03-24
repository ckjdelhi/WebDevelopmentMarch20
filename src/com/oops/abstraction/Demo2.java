package com.oops.abstraction;
/*
 * Interface
 * 1. all methods are by default public & abstract
 * 2. all variable are by default final
 * 3. we cannot create object of interface
 * 4. we have to implements interface in other class
 * 5. we have to override all methods of interface
 */
interface ITest{
	int age=20;  // public static final int age = 20;
	void show();  // public abstract void show();
	void display(); //public abstract void display();
}

public class Demo2 implements ITest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 obj=new Demo2();
		obj.show();
		obj.display();
		System.out.println(ITest.age);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
