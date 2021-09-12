package com.bankapp.transaction.file.operation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.bankapp.transaction.constant.Constant;
import com.bankapp.transaction.constant.Messages;
import com.bankapp.transaction.details.BasicDetails;
import com.bankapp.transaction.matcher.FindMatcher;

/**
 * @author Teja Vardhan
 *
 */
public class ReadFile {

	Scanner myReader;
	BasicDetails bd = new BasicDetails();
	String[] items = new String[Constant.ARRAYLENGTH];
	String Separater = "[=?]";

	public void readFile(String accountNumber) throws NullPointerException, IOException {

		BufferedReader br = null;
		ArrayList<String> arrayList = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader(Constant.filepath + accountNumber + Constant.extenstion));

			for (String line; (line = br.readLine()) != null;) {

				String[] split = line.split(Separater);
				String name = split[Constant.ZERO];
				if (name.equals(Constant.ACCOUNT_NUMBER)) {
					arrayList.add(split[Constant.ONE]);
				} else if (name.equals(Constant.BALANCE)) {
					arrayList.add(split[Constant.ONE]);
				} else if (name.equals(Constant.PIN)) {
					arrayList.add(split[Constant.ONE]);
				} else if (name.equals(Constant.ADHAARNO)) {
					arrayList.add(split[Constant.ONE]);
				}
			}

			br.close();
			new FindMatcher().getItem(arrayList);
		} catch (Exception e) {
			System.out.println(Messages.MessagesCode(Constant.ACF002));
		}

	}
}
