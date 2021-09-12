
package com.bankapp.onboard.validation;

import java.util.Scanner;

public class CustomerMinimumBalance {
	public static final int MIN_BALANCE = 500;

	public int customerMinimumBalance() {

		Scanner sc = new Scanner(System.in);
		System.out.println("deposit minimum  balance");
		int Minbalance = sc.nextInt();
		if (Minbalance >= MIN_BALANCE) {
			return Minbalance;
		} else {
			System.out.println("please enter required ammount! retry it ");
		}
		return 0;
	}
}
