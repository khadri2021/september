package com.bankapp.transaction.details;

/**
 * @author Teja Vardhan
 *
 */
public class BasicDetails {

	private String accountNumber;
	private String balance;
	private String pin;
	private String aadharNumber;


	

	@Override
	public String toString() {
		return "BasicDetails [accountNumber=" + accountNumber + ", balance=" + balance + ", pin=" + pin
				+ ", aadharNumber=" + aadharNumber + "]";
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

}
