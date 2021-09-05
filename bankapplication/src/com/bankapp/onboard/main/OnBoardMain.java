package com.bankapp.onboard.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

import com.bankapp.onboard.validation.CustomerMinimumBalance;
import com.bankapp.onboard.validation.EkycService;

public class OnBoardMain {

	private static final int Minbalance = 0;

	public static void main(String[] args) throws IOException {
		EkycService e = new EkycService();
		BufferedReader readerkyc = EkycService.checkE_kyc();
		if (Objects.nonNull(readerkyc)) {
			System.out.println(readerkyc.readLine());
			String contentLine = readerkyc.readLine();
			while (contentLine != null) {
				System.out.println(contentLine);
				contentLine = readerkyc.readLine();
				createAccountFile();
				CustomerMinimumBalance balance = new CustomerMinimumBalance();
				minimumBalance();
			}
		}
	}

	public static void createAccountFile() throws IOException {
		String accountNumber = getAccountNumber();
		System.out.println(accountNumber);

		StringBuilder sb = new StringBuilder(accountNumber);
		sb.append(".txt");
		File f = new File("D:\\Task\\suhasini\\onboarding", sb.toString());
		f.createNewFile();
	}

	private static String getAccountNumber() {
		String uuid = UUID.randomUUID().toString().replace("-", "");
		String accNumber = uuid.substring(0, 11).toUpperCase();
		return accNumber;
	}

	public static void minimumBalance() {
		int MIN_BALANCE = 500;
		if (Minbalance >= MIN_BALANCE) {
			if (Minbalance >= MIN_BALANCE) {
				System.out.println("create account");
			} else {
				System.out.println("please enter required ammount! retry it ");
			}

		}

	}
}
