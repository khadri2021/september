package com.bankapp.transaction;

import java.util.Scanner;

import com.bankapp.transaction.constant.Constant;
import com.bankapp.transaction.constant.Messages;
import com.bankapp.transaction.details.BasicDetails;
import com.bankapp.transaction.file.operation.WriteFile;

/**
 * @author Teja Vardhan
 *
 */
public class Deposite {
	Scanner sc = new Scanner(System.in);
	int money;

	public void deposite(BasicDetails bd) {
		System.out.println(Messages.MessagesCode(Constant.DEPTMSG));
		int add_money = sc.nextInt();
		try {
			money = Integer.parseInt(bd.getBalance());
		} catch (Exception e) {
			System.out.println(Messages.MessagesCode(Constant.RERROR));
		}
		money = Integer.parseInt(bd.getBalance());
		int avaliable = add_money + money;
		bd.setBalance(Integer.toString(avaliable));
		System.out.println(Constant.ACCOUNT_NUMBER + " : " + bd.getAccountNumber());
		System.out.println(Messages.MessagesCode(Constant.ALBAL) + bd.getBalance());
		System.out.println("Transaction successful");
		new WriteFile().writeIntoFile(bd.getAccountNumber(),bd.getBalance(),bd.getPin());
	}

}
