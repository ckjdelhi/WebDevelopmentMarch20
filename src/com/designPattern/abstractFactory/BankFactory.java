package com.designPattern.abstractFactory;

public class BankFactory  extends AbstractFactory{

	@Override
	public Bank getBank(String bankName) {
		Bank obj=null;
		if(bankName.equalsIgnoreCase("hdfc")) {
			obj=new HDFCBank();
		}else if(bankName.equalsIgnoreCase("icici")) {
			obj=new ICICIBank();
		}else if(bankName.equalsIgnoreCase("sbi")) {
			obj=new SBIBank();
		}
		return obj;
	}

	@Override
	public Loan getLoan(String loanType) {
		return null;
	}

}
