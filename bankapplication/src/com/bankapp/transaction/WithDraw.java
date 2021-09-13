package com.bankapp.transaction;

import java.io.File;
import java.util.Scanner;

import com.bankapp.transaction.constant.Constant;
import com.bankapp.transaction.constant.Messages;
import com.bankapp.transaction.details.BasicDetails;
import com.bankapp.transaction.file.operation.WriteFile;

/**
 * @author Teja Vardhan
 *
 */
public class WithDraw {
	Scanner sc = new Scanner(System.in);
	public static int callerCounter = 0;

	public WithDraw() {
		callerCounter++;
	}

	public void withDrawMoney(BasicDetails bd) {

		System.out.println(Constant.ENTERPIN);
		String pin = sc.next();
		if (pin.equals(bd.getPin())) {
			System.out.println(Messages.MessagesCode(Constant.ALBAL) + bd.getBalance());
			System.out.println(Messages.MessagesCode(Constant.MW001));
			int withDrawMoney = sc.nextInt();
			if (withDrawMoney > Integer.parseInt(bd.getBalance())) {
				System.out.println(Messages.MessagesCode(Constant.ISB));
				System.out.println("Enter Valid Amount");
				WithDraw draw = new WithDraw();
				draw.withDrawMoney(bd);
			} else {
				int remaing_money = Integer.parseInt(bd.getBalance()) - withDrawMoney;
				bd.setBalance(Integer.toString(remaing_money));
				System.out.println(Messages.MessagesCode(Constant.ALBAL) + remaing_money);
				System.out.println("Transaction successful");
				new WriteFile().writeIntoFile(bd.getAccountNumber(), bd.getBalance(), bd.getPin(),
						bd.getAadharNumber());

			}
		} else {

			
			
			if (callerCounter > 3) {
				System.out.println("Three times completed");
				File f = new File(Constant.filepath +bd.getAccountNumber()+Constant.extenstion);
				f.delete();
				System.out.println("Sorry! Your Account has been deleted");
			}
			else {
				System.out.println(callerCounter + " Chance enter Valid Pin : ");
				WithDraw draw = new WithDraw();
				draw.withDrawMoney(bd);
			}

			
		}
		

	}

}
