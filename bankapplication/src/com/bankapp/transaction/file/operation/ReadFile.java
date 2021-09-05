package com.bankapp.transaction.file.operation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bankapp.transaction.constant.Constant;
import com.bankapp.transaction.constant.Messages;
import com.bankapp.transaction.details.BasicDetails;
import com.bankapp.transaction.matcher.FindMatcher;

public class ReadFile {

	Scanner myReader;
	BasicDetails bd = new BasicDetails();
	String[] items = new String[Constant.ARRAYLENGTH];
	String Separater = "[=?]";

	public void readFile(String accountNumber) throws NullPointerException, IOException {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(Constant.filepath + accountNumber + Constant.extenstion));

			for (String line; (line = br.readLine()) != null;) {

				String[] split = line.split(Separater);
				String name = split[Constant.ZERO];
				if (name.equals(Constant.ACCOUNT_NUMBER)) {
					items[0] = split[Constant.ONE];
				} else if (name.equals(Constant.PIN)) {
					items[1] = split[Constant.ONE];
				} else if (name.equals(Constant.BALANCE)) {
					items[2] = split[Constant.ONE];
				} 
			}

			br.close();
			new FindMatcher().getItem(items);
		} catch (Exception e) {
			System.out.println(Messages.MessagesCode(Constant.ACF002));
		}

	}
}
