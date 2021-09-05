package com.bankapp.onboard.validation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EkycService {
	public static BufferedReader checkE_kyc() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AdharNumber");
		String aadhrNumber = sc.next();
		StringBuilder sb = new StringBuilder(aadhrNumber);
		sb.append(".txt");
		File f = new File("D:\\Task\\suhasini\\ekyc_registation", sb.toString());
		if (f.exists()) {
			System.out.println("#### WELCOME TO ON BOARDING");
			BufferedReader br=new BufferedReader(new FileReader(f));
			System.out.println(br.readLine());
			return br;
		} else {
			System.out.println("AdharNumber Invalid ! Try again.");
		}
		return null;
	}
}
