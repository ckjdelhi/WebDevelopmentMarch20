package com.basic;

//28+28 = 56 bytes
public class DataTypesDemo2 {

	 int a=4;
	 double d=300.20;
	 long l=40;
	 
	 String s="abcd"; //2 x 4= 8 byte
	
	public static void main(String[] args) {
		DataTypesDemo2 obj = new DataTypesDemo2(); // 28 bytes
		DataTypesDemo2 obj2 = new DataTypesDemo2(); // 28 bytes
	}

}
