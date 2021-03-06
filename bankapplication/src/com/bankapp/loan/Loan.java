package com.bankapp.loan;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bankapp.constants.EkycConstants;
import com.bankapp.loan.accountverifi.AccountVerify;
import com.bankapp.loan.writetofile.UpdateBalance;
import com.bankapp.transaction.constant.Constant;

public class Loan {

	private static Scanner scanner;

	public static void main() {

		scanner = new Scanner(System.in);

		System.out.println("Enter Your Aadhar Number");

		String aadhar = scanner.next();

		File ekycFile = new File(EkycConstants.EKYC_PATH + aadhar + Constant.extenstion);

		if (ekycFile.exists()) {

			try {
				AccountVerify.accountVerify();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else
			System.out.println("Does not exists");

	}

	public void loanProcess(ArrayList arrayList, String accountNumber) {
		Object[] array = arrayList.toArray();
		String balance = ((String) array[2]).split(Constant.SEPARATER)[1];
		int finalBalance = Integer.parseInt(balance);
		System.out.println("Enter Loan Amount");
		int desiredLoan = scanner.nextInt();
		if (desiredLoan <= (finalBalance * 0.60)) {
			int remainingBalace = finalBalance - desiredLoan;
			try {
				UpdateBalance balance2 = new UpdateBalance();
				balance2.updateBalance(accountNumber, remainingBalace, arrayList);
				System.out.println("Loan Sanctioned");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Your not Eligible to Loan");

		}

	}

}
