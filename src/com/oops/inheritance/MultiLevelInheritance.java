package com.oops.inheritance;
class GrandParent{
	void delete() {
		System.out.println("G:Delete");
	}
}
class Parent extends GrandParent{
	void show() {
		System.out.println("P: show");
	}
}

class Child extends Parent{
	void display() {
		System.out.println("C:display");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.show();
		obj.delete();
		
		Parent obj2=new Parent();
		obj2.show();
		obj2.delete();
	}

}
