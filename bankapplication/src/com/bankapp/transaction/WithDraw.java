package com.bankapp.transaction;

import java.util.Scanner;

import com.bankapp.transaction.constant.Constant;
import com.bankapp.transaction.constant.Messages;
import com.bankapp.transaction.details.BasicDetails;
import com.bankapp.transaction.file.operation.WriteFile;

public class WithDraw {
	Scanner sc = new Scanner(System.in);

	public void withDrawMoney(BasicDetails bd) {
		System.out.println(Constant.ENTERPIN);
		String pin = sc.next();
		if (pin.equals(bd.getPin())) {
			System.out.println(Messages.MessagesCode(Constant.ALBAL) + bd.getBalance());
			System.out.println(Messages.MessagesCode(Constant.MW001));
			int withDrawMoney = sc.nextInt();
			if (withDrawMoney > Integer.parseInt(bd.getBalance())) {
				System.out.println(Messages.MessagesCode(Constant.ISB));
			} else {
				int remaing_money = Integer.parseInt(bd.getBalance()) - withDrawMoney;
				bd.setBalance(Integer.toString(remaing_money));
				System.out.println(Messages.MessagesCode(Constant.ALBAL) + remaing_money);
				System.out.println("Transaction successful");
				new WriteFile().writeIntoFile(bd.getAccountNumber(),bd.getBalance(),bd.getPin());

			}
		} else {
			System.out.println(Constant.INVALIDPIN);
		}

	}

}
