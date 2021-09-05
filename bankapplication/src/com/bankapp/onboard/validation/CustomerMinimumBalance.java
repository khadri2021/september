
package com.bankapp.onboard.validation;

import java.util.Scanner;

public class CustomerMinimumBalance {
	public static final int MIN_BALANCE = 500;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("deposit minimum  balance");
		int Minbalance = s.nextInt();
		if (Minbalance >= MIN_BALANCE) {
			System.out.println("create account");
		} else {
			System.out.println("please enter required ammount! retry it ");
		}
	}
}
