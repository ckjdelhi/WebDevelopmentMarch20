package com.string;

public class StringDemo2 {

	public static void main(String[] args) {
		String a="T";
		String b="t";
		System.out.println(a.hashCode() +"\t"+b.hashCode());
		
		String str="This is java class";
		String str1="this is Java class";
		System.out.println(str.toUpperCase().equals(str1.toUpperCase()));
		
		System.out.println(str.length());//18
		System.out.println(str.charAt(0));//T
		System.out.println(str.concat(" hello"));
		System.out.println(str.contains("java"));
		System.out.println(str.hashCode());
		System.out.println(str.indexOf('s'));//3
		System.out.println(str.intern());
		System.out.println(str.isEmpty());
		System.out.println(str.replace('a', 'A'));
		System.out.println(str.substring(8));//java class
		System.out.println(str.substring(8, 12));//java
		System.out.println(str.toUpperCase());//THIS IS JAVA CLASS
		System.out.println(str.split(" ")[3]);
		System.out.println(str.toCharArray());
		
		int age=20;
		String t=String.valueOf(age);
		
		String s1="AA";
		String s2="AA";
		System.out.println(s1.compareTo(s2)); //-ve, 0, +ve
		
	}

}
