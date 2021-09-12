package com.bankapp.transaction.matcher;

import java.util.ArrayList;
import java.util.Scanner;

import com.bankapp.transaction.Deposite;
import com.bankapp.transaction.WithDraw;
import com.bankapp.transaction.details.BasicDetails;

/**
 * @author Teja Vardhan
 *
 */
public class FindMatcher {
	BasicDetails bd = new BasicDetails();
	Scanner sc = new Scanner(System.in);

	public void getItem(ArrayList<String> arrayList) {

		bd.setAccountNumber((String) arrayList.get(0));
		bd.setPin((String) arrayList.get(1));
		bd.setBalance((String) arrayList.get(2));
		bd.setAadharNumber((String) arrayList.get(3));

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