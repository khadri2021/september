package com.bankapp.onboard.account;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.bankapp.onboard.validation.CustomerMinimumBalance;
import com.bankapp.onboard.validation.EkycService;
import com.bankapp.transaction.constant.Constant;

/**
 * @author Teja Vardhan
 *
 */
public class AccountOpen {
	public void createAccountFile() throws IOException {
		String readerkyc = EkycService.checkE_kyc();

		String aadhar = readerkyc;
		String accountNumber = getAccountNumber();
		File f = new File(Constant.filepath + accountNumber + Constant.extenstion);

		if (!f.exists()) {
			f.createNewFile();
			String pin = accountNumber.substring(5, 9);
			System.out.println("Your Account Number : " + accountNumber);
			CustomerMinimumBalance cmb = new CustomerMinimumBalance();
			int minimBalance = cmb.customerMinimumBalance();

			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f, true));

			bufferedWriter.write(Constant.ACCOUNT_NUMBER + "=" + accountNumber + "\n");
			bufferedWriter.write(Constant.PIN + "=" + pin + "\n");
			bufferedWriter.write(Constant.BALANCE + "=" + minimBalance + "\n");
			bufferedWriter.write(Constant.ADHAARNO + "=" + aadhar + "\n");
			bufferedWriter.close();
			System.out.println("Sucessfully add balance to your account");
		} else {
			AccountOpen accountOpen = new AccountOpen();
			accountOpen.createAccountFile();
		}
	}

	private static String getAccountNumber() {
		long random = (long) (Math.random() * 1000000000 * 1000000000);
		String uuid = Long.toString(random);
		String accNumber = uuid.substring(0, 12);
		return accNumber;
	}

}
