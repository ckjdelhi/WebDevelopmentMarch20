package com.markerInterface;

public class Demo implements ITest{

	public static void main(String[] args) {
		
		Demo o=new Demo();
		if(o instanceof ITest)
		{
			System.out.println("Yes");
		}

	}

	

}
