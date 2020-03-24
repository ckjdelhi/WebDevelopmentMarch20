package com.oops.encapsulation;

/*
 * POJO class (Plain Old Java Object)
 * 1. all variables should be private
 * 2. add default constructor
 * 3. add parameterized constructor
 * 4. add getter/setter methods
 * 5. override toString method
 * 6. override hashCode and equals method
 * 7. implements Comparable interface for default sorting
 */
public class Employee implements Comparable<Employee>{
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	public Employee() {
	}
	public Employee(String firstName, String lastName, int age, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		//Sorting using firstName
		//return this.getFirstName().compareTo(o.getFirstName());
		
		//Sorting using salary
		return (int) (o.getSalary() - this.getSalary());
	}

	
}
