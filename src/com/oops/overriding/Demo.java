package com.oops.overriding;

class Parent{
	void show() {
		System.out.println("P:show");
	}
	void insert() {
		System.out.println("P: Insert");
	}
}
class Child extends Parent{
	void display() {
		System.out.println("C:display");
	}
	
	void show() {
		System.out.println("C: Show");
	}
	
}
class SubChild extends Child{
	void show() {
		System.out.println("S: Show");
	}
	void delete() {
		System.out.println("S: Delete");
	}
}
public class Demo {

	public static void main(String[] args) {
		Child c = (Child)new Parent(); //can't cast to child class
		c.show();
		c.display();
		c.insert();
		
		/*Child obj=new SubChild();
		obj.show(); //S:show
		obj.display();//C:display*/
		
		Parent obj=new SubChild();
		obj.show(); //S: show
		obj.insert();//P: insert
		//obj.display();
		//obj.delete();
		
		/*Child obj=new Child();
		obj.show();
		obj.insert();
		obj.display();
		System.out.println("-------------------");
		Parent obj2=new Parent();
		obj2.show();
		obj2.insert();
		System.out.println("----------------------");
		*/
		/*Parent obj3=new Child();
		obj3.show();
		obj3.insert();
		//obj3.display();
		*/
		
		
		
		
	}

}
