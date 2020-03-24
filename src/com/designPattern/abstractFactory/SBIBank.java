package com.designPattern.abstractFactory;

public class SBIBank implements Bank {
	private String bankName;
	public SBIBank() {
		bankName="SBI Bank";
	}
	@Override
	public String getBankName() {
		return bankName;
	}
}
