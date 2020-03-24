/*
 * package com.oops.abstraction; Abstract class 1. cannot instantiate class or
 * create object 2. we can have abstract method and normal method(concrete
 * method) 3. we have to extends Abstract class 4. we have to implement all
 * abstract method
 * 
 * 
 * 
 * abstract class Test{ //concrete method void show() {
 * System.out.println("show"); } abstract void display(); }
 * 
 * 
 * public class Demo extends Test{
 * 
 * public static void main(String[] args) { Demo obj=new Demo(); obj.show();
 * obj.display();
 * 
 * }
 * 
 * @Override void display() { System.out.println("display"); }
 * 
 * }
 */