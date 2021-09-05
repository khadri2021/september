package com.bankapp.transaction.matcher;

import java.util.Scanner;

import com.bankapp.transaction.Deposite;
import com.bankapp.transaction.WithDraw;
import com.bankapp.transaction.details.BasicDetails;

public class FindMatcher {
	BasicDetails bd = new BasicDetails();
	Scanner sc = new Scanner(System.in);

	public void getItem(String[] items) {
		bd.setAccountNumber(items[0]);
		bd.setPin(items[1]);
		bd.setBalance(items[2]);

		System.out.println("Enter Transication you want to do : ");
		System.out.println("1 Deposite\n2 WithDraw");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			new Deposite().deposite(bd);
			break;
		case 2:
			new WithDraw().withDrawMoney(bd);
			break;
		default:
			break;
		}

	}
}