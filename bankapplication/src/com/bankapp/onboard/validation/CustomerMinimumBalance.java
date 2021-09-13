
package com.bankapp.onboard.validation;

import java.util.Scanner;

public class CustomerMinimumBalance {
	public static final int MIN_BALANCE = 500;
	private Scanner sc;

	public int customerMinimumBalance() {

		sc = new Scanner(System.in);
		System.out.println("deposit minimum  balance");
		int Minbalance = sc.nextInt();
		if (Minbalance >= MIN_BALANCE) {
			return Minbalance;
		} else {
			System.out.println("please Try Again");
			CustomerMinimumBalance balance = new CustomerMinimumBalance();
			balance.customerMinimumBalance();
			
		}
		return 0;

	}
}
