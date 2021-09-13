package com.bankapp.main;

import java.io.IOException;
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
			try {
				AccountOpen accountOpen =new AccountOpen();
				accountOpen.createAccountFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;

		case 2:
			Input input = new  Input();
			input.inputValues();
			break;

		default:
			break;
		}

	}

}
