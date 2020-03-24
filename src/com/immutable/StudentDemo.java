package com.immutable;

public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student obj=new Student(100, "chandan");
		System.out.println(obj.getName());
		
		Student obj1 = (Student)obj.clone();
		System.out.println(obj1.getName());
		
		if(obj == obj1)
			System.out.println("same object");
		else
			System.out.println("different object");

	}
	
	
}
