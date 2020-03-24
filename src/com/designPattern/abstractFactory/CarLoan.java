package com.designPattern.abstractFactory;

public class CarLoan implements Loan {

	@Override
	public String loanType() {
		return "Car Loan";
	}

}
