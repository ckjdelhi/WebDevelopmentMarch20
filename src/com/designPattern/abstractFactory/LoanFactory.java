package com.designPattern.abstractFactory;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bankName) {
		return null;
	}

	@Override
	public Loan getLoan(String loanType) {
		Loan obj=null;
		if(loanType.equalsIgnoreCase("homeloan")) {
			obj=new HomeLoan();
		}else if(loanType.equalsIgnoreCase("educationalloan")) {
			obj=new EducationalLoan();
		}else if(loanType.equalsIgnoreCase("carloan")) {
			obj=new CarLoan();
		}
		return obj;
	}

}
