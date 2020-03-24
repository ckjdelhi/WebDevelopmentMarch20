package com.designPattern.abstractFactory;

public class Test {

	public static void main(String[] args) {
			AbstractFactory bankFactory=new BankFactory();
			Bank obj=bankFactory.getBank("sbi");
			System.out.println(obj.getBankName());
			obj=bankFactory.getBank("icici");
			System.out.println(obj.getBankName());
			obj=bankFactory.getBank("hdfc");
			System.out.println(obj.getBankName());
			
			AbstractFactory loanFactory=new LoanFactory();
			Loan obj1 = loanFactory.getLoan("homeloan");
			System.out.println(obj1.loanType());
			obj1 = loanFactory.getLoan("educationalloan");
			System.out.println(obj1.loanType());
			obj1 = loanFactory.getLoan("carloan");
			System.out.println(obj1.loanType());

	}

}
