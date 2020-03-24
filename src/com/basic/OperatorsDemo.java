package com.basic;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Arithmetic Operator (+, -, *, / , %)
		
		//System.out.println(5 + 5 +"hi"+ (5 + 5));//10hi55
		//System.out.println(11 % 6); //2
		
		//Unary Operator(+(positive), -, ++, --)
		//int a = -5;
		//System.out.println(a);
		//int num = 2;
		//System.out.println(num++ + ++num + num-- + num--);// 2 + 4 + 4 + 3 = 13
		//num++;
		//int a= num++;
		//System.out.println(a);//3
		
		//Relational Operator (>, < , ==, >=, <=, !=) : boolean value
		//int a=5;
		//int b=6;
		//System.out.println(a<=b);//false
		
		//Logical Operator (&&, ||) : boolean value
		/*int a=5;
		int b=3;
		int c=1;
		System.out.println(a>b || a<c); //true || false = true*/
		/*
		 * &&
		 * true && true = true
		 * true && false = false
		 * false && true = false
		 * false && false = false
		 * 
		 * ||
		 * true || true = true
		 * true || false = true
		 * false || true = true
		 * false || false = false
		 */
		
		//Ternary Operator(condition?true statement:false statement)
		/*int a=2;
		int b=13;
		int c=6;
		if(a>b) {
			if(a>c) {
				System.out.println("Yes a is bigger number");
			}else {
				System.out.println("No a is not bigger number");
			}
		}else {
			if(b>c) {
				System.out.println("Yes b is bigger number");
			}else {
				System.out.println("No b is not bigger number");
			}
		}
		
		System.out.println(a>b? (a>c?"Yes a is bigger number":"No a is not bigger number"):(b>c?"Yes b is bigger number": "No b is not bigger number"));
		*/
		//Bitwise operator (&, |)
		//int a=5;
		//System.out.println(a | 1);
		
		//Shift Operator(<<, >>)
		//int a=5;
		//System.out.println(a >> 1); //2
	}

}
