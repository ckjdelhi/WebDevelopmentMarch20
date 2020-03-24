package com.oops.inheritance;

class Parent1{
	void show() {
		System.out.println("P:show");
	}
}
class Child1 extends Parent1{
	void c1Show() {
		System.out.println("C1 show");
	}
}
class Child2 extends Parent1{
	
}
class Child3 extends Parent1{
	
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.show();
		obj.c1Show();
		
		Child2 obj2=new Child2();
		obj2.show();
	}

}
