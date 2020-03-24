package com.string;

public class StringDemo {

	public static void main(String[] args) {
		String s1="abc";
		String s2=new String("abc");
		
		s2=s2.intern();
		
		String s3="abc";
		
		if(s1.equals(s2)) {
			System.out.println("same values");
		}else {
			System.out.println("not same");
		}
		
		if(s1 == s2) {
			System.out.println("same object");
		}else {
			System.out.println("different object");
		}
		
		
		
		
	}

}
