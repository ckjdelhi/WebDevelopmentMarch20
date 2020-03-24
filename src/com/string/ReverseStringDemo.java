package com.string;

public class ReverseStringDemo {

	public static void main(String[] args) {
		String str="This is java class";
		
		for(int i=str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		StringBuffer sb=new StringBuffer(str); 
		System.out.println(sb.reverse());  //ssalc avaj si sihT
		
		//sihT si avaj ssalc
		String words[]=str.split(" ");
		String s="";
		for(String word: words) {
			s=s+ new StringBuilder(word).reverse() +" ";
		}
		System.out.println(s);
		
	}

}
