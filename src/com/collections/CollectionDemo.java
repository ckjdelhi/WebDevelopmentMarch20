package com.collections;

import java.util.*;

import com.oops.encapsulation.Employee;

public class CollectionDemo {

	public static void main(String[] args) {
		/*List<Integer> obj=new ArrayList<Integer>();
		obj.add(200);
		obj.add(100);
		obj.add(200);
		obj.add(400);
		System.out.println(obj);//[200, 100, 200, 400]*/
		
		/*Set<Integer> obj=new TreeSet<Integer>();
		obj.add(200);
		obj.add(100);
		obj.add(200);
		obj.add(400);
		System.out.println(obj);//[400, 100, 200]*/
		
		/*LinkedList<Integer> obj =new LinkedList<Integer>(); //Stack
		obj.add(200);
		obj.add(100);
		obj.add(200);
		obj.add(400);
		System.out.println(obj);
		obj.push(500);
		
		System.out.println(obj);
		obj.pop();
		obj.pop();
		System.out.println(obj);*/
		
		/*List<Employee> listOfEmployee=new LinkedList<Employee>();
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
		
		System.out.println("Total Objects: "+listOfEmployee.size());
		System.out.println(listOfEmployee);*/
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(30);
		list2.add(40);
		
		list1.addAll(list2);
		
		System.out.println(list1);
		System.out.println(list1.get(3));//40
		list1.set(3, 50);
		System.out.println(list1);
		
		//Delete
		//list1.remove(new Integer(50));
		//System.out.println(list1);
		//Search
		System.out.println(list1.containsAll(list2));
		
	}

}
