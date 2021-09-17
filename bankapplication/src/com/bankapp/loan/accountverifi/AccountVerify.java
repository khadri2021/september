package com.bankapp.loan.accountverifi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bankapp.loan.Loan;
import com.bankapp.transaction.constant.Constant;

public class AccountVerify {

	private static Scanner scanner;

	public static void accountVerify() throws IOException {
		Loan loan = new Loan();
		scanner = new Scanner(System.in);

		System.out.println("Enter Your Account Number Number");

		String accountNumber = scanner.next();

		File accountFile = new File(Constant.filepath + accountNumber + Constant.extenstion);

		if (accountFile.exists()) {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(accountFile));
			String line;
			ArrayList<String> arrayList = new ArrayList<String>();

			while ((line = bufferedReader.readLine()) != null) {
				
                
				arrayList.add(line);

			}
			loan.loanProcess(arrayList);
			bufferedReader.close();
		} else {
			System.out.println("Please Open new Account");

		}

	}

}
