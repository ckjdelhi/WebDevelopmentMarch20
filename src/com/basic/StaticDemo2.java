package com.basic;

public class StaticDemo2 {

	static int AC=17;
	String name="demo";
	
	public static void main(String[] args) {
		StaticDemo2 obj1=new StaticDemo2();
		StaticDemo2.AC=18;
		obj1.name="chandan";
		
		StaticDemo2 obj2=new StaticDemo2();
		StaticDemo2.AC=20;
		obj2.name="Suma";
		
		
		System.out.println(StaticDemo2.AC + "\t"+ obj1.name);
		System.out.println(StaticDemo2.AC + "\t"+ obj2.name);
		
	}

}
