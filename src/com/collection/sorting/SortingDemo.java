package com.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class SortingDemo {

	public static void main(String[] args) {
		//For all Wrapper classes(Integer, Float, Double, Decimal, Byte, Short, Boolean) and String
		List<Integer> zipCode=new LinkedList<Integer>();
		zipCode.add(100);
		zipCode.add(99);
		zipCode.add(98);
		zipCode.add(101);
		System.out.println(zipCode);
		Collections.sort(zipCode);
		System.out.println(zipCode);
		
		List<String> names=new ArrayList<String>();
		names.add("Nepal");
		names.add("India");
		names.add("US");
		names.add("Pakistan");
		names.add("US");
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("4Vineeth", "Reddy", 15, 7000));
		employees.add(new Employee("3Vineeth", "Reddy", 16, 6000));
		employees.add(new Employee("6Vineeth", "Reddy", 11, 4000));
		employees.add(new Employee("5Vineeth", "Reddy", 20, 8000));
		System.out.println("--------Before Sorting-----------");
		for(Employee obj: employees) {
			System.out.println(obj.getFirstName() +"\t"+ obj.getLastName()+"\t"+obj.getAge()+"\t"+obj.getSalary());
		}
		
		Collections.sort(employees);
		System.out.println("---------Default sorting by salary----------");
		for(Employee obj: employees) {
			System.out.println(obj.getFirstName() +"\t"+ obj.getLastName()+"\t"+obj.getAge()+"\t"+obj.getSalary());
		}
		
		System.out.println("----------------Sorting by firstName------------");
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		for(Employee obj: employees) {
			System.out.println(obj.getFirstName() +"\t"+ obj.getLastName()+"\t"+obj.getAge()+"\t"+obj.getSalary());
		}
		
		System.out.println("----------------Sorting by Age------------");
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getAge()-o1.getAge();
			}
		});
		for(Employee obj: employees) {
			System.out.println(obj.getFirstName() +"\t"+ obj.getLastName()+"\t"+obj.getAge()+"\t"+obj.getSalary());
		}
		
		System.out.println("----------------Sorting by Age ASC------------");
		Collections.sort(employees, new AgeComparatorASC());
		for(Employee obj: employees) {
			System.out.println(obj.getFirstName() +"\t"+ obj.getLastName()+"\t"+obj.getAge()+"\t"+obj.getSalary());
		}
		System.out.println("----------------Sorting by Age DESC------------");
		Collections.sort(employees, new AgeComparatorDESC());
		for(Employee obj: employees) {
			System.out.println(obj.getFirstName() +"\t"+ obj.getLastName()+"\t"+obj.getAge()+"\t"+obj.getSalary());
		}
		System.out.println("----------------Sorting by First Name DESC------------");
		Collections.sort(employees, new FirstNameComparatorDESC());
		employees.forEach(obj -> System.out.println(obj.getFirstName() +"\t"+ obj.getLastName()+"\t"+obj.getAge()+"\t"+obj.getSalary()));
	}

}
