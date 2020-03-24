package com.oops.encapsulation2;

import com.oops.encapsulation.Demo;

public class Demo3 extends Demo{

	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		System.out.println(obj.age);
		//System.out.println(obj.salary); //private
		//System.out.println(obj.zipCode); //default
		System.out.println(obj.name);//protected
	}

}
