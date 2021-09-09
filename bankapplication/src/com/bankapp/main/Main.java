package com.bankapp.main;

import java.util.Scanner;

import com.bankapp.onboard.account.AccountOpen;
import com.bankapp.transaction.input.Input;

/**
 * @author Teja Vardhan
 *
 */
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Welcome TO Khadiri Bank");
		System.out.println("1 New User\n2 Existing User");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			new AccountOpen();
			break;

		case 2:
			new Input().inputValues();
			break;

		default:
			break;
		}

	}

}
