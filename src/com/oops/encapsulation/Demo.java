package com.oops.encapsulation;

/*
 * Access Modifiers(private -> default -> protected -> public)
 * 1. Public : member can be accessible everywhere
 * 2. Private: member can be accessible only within the same class
 * 3. Protected: member can be accessible within same package and outside of package using inheritance
 * 4. default: member can be accessible within same package
 */
public class Demo {
	public int age=20;//same class, same package, another package
	private int salary=4000;//same class
	int zipCode=1111;//same class, same package
	protected String name="abc";//Same class, same package
	
	public static void main(String arg[]) {
		Demo obj=new Demo();
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.zipCode);
		System.out.println(obj.name);
	}
}