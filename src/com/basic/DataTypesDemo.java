package com.basic;
/*
 * 0001 =1
 * 0010 =2
 * 0011 =3
 * 0100 =4
 * 0101 =5
 * 0110 =6
 * 0111 =7
 * 1000 =8
 * 1001 =9
 * 1010 =10
 *  0 or 1 = 1 bit
 *  8 bits = 1 byte
 *  1024 bytes = 1KB (kilo byte)
 *  1024KB = 1MB(Mega Byte)
 *  1024MB = 1GB (Gigi Byte)
 *  1024GB = 1TB (Tera Byte)
 *  
 */
public class DataTypesDemo {
	
	public static void main(String[] args) {
		
		boolean isValid = true; //1 bit
		System.out.println(isValid);
		
		char c='A'; //ASCII code
		char c1=97;
		byte b=127; // 1 byte
		short s=128; // 2 bytes
		int i=30; //4 bytes
		long l=30;//8 bytes
		
		float f=300.40f; //4 bytes
		double d=300.40;
		
		
	}

}
