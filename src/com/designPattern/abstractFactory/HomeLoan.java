package com.designPattern.abstractFactory;

public class HomeLoan implements Loan {

	@Override
	public String loanType() {
		return "Home loan";
	}
	
}
