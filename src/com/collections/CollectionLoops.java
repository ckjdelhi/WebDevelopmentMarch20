package com.collections;

import java.util.LinkedList;
import java.util.List;

import com.oops.encapsulation.Employee;

public class CollectionLoops {

	public static void main(String[] args) {
		List<Employee> listOfEmployee=new LinkedList<Employee>();
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
		
		listOfEmployee.add(obj);
		listOfEmployee.add(obj2);
		listOfEmployee.add(obj3);
		
		/*for(Employee e1: listOfEmployee) {
			System.out.println(e1.getFirstName());
		}*/
		/*listOfEmployee.forEach(e1 -> {
			System.out.print(e1.getFirstName());
			System.out.print(e1.getLastName());
		});*/
		
		listOfEmployee.stream()
		.filter(e1 ->e1.getSalary()>5000 && e1.getSalary()<7000)
		.forEach(e1 -> System.out.println(e1.getFirstName()));
		
		

	}

}
