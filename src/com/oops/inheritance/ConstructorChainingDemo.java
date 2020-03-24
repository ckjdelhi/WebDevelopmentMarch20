package com.oops.inheritance;
class ParentTest{
	public ParentTest() {
		System.out.println("P-T1");
	}
	public ParentTest(int a) {
		System.out.println("P-T2");
	}
	
}
class Test extends ParentTest{
	public Test() {
		this(10);
		System.out.println("T1");
	}
	public Test(int a) {
		super(200);
		System.out.println("T2");
	}
}

public class ConstructorChainingDemo {

	public static void main(String[] args) {
	
		new Test();
		
	}

}
