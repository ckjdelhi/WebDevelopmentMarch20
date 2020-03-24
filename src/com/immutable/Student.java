package com.immutable;

/**
 * About 'final' non access modifier
 * 1. With Class: class cannot be extended
 * 2. With Method: method cannot be overridden
 * 3. With Variable: Variable cannot be reassigned
 * 
 * Immutable class:
 * 1. make class as final
 * 2. make all variable as private
 * 3. add only getter method
 * 4. add parameterized constructor
 *
 */
public final class Student implements Cloneable{
	private int studId;
	private String name;
	
	public Student(int studId, String name) {
		this.studId = studId;
		this.name = name;
	}
	public int getStudId() {
		return studId;
	}
	public String getName() {
		return name;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
