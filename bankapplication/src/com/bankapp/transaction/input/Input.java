package com.bankapp.transaction.input;

import java.util.Scanner;

import com.bankapp.transaction.constant.Constant;
import com.bankapp.transaction.constant.Messages;
import com.bankapp.transaction.file.operation.ReadFile;

/**
 * @author Teja Vardhan
 *
 *
 */
public class Input {

	private Scanner sc;

	public void inputValues() {
		sc = new Scanner(System.in);
		System.out.println(Messages.MessagesCode(Constant.BKN01));

		String accountNumber = sc.next();

		ReadFile readFile = new ReadFile();
		try {
			readFile.readFile(accountNumber);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
