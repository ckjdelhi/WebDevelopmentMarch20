package com.oops.encapsulation;

public class EmployeeTester {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setFirstName("Chandan");
		obj.setLastName("Kumar");
		obj.setAge(20);
		obj.setSalary(5000);
		
		Employee obj2=new Employee();
		obj2.setFirstName("Suma");
		obj2.setLastName("Kumari");
		obj2.setAge(18);
		obj2.setSalary(6000);
		
		Employee obj3=new Employee("Vineeth", "Reddy", 15, 7000);
		
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
		
	}

}
