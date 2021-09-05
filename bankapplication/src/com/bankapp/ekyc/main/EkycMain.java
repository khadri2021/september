package com.bankapp.ekyc.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.bankapp.ekyc.aadhar.AadharGeneration;

public class EkycMain {
	public static void main(String[] args) throws IOException {
		System.out.println("######## Ekyc Registration ###########");
		StringBuilder adhaarNumber = AadharGeneration.getAdhaarNumber();
		System.out.println(adhaarNumber.toString());
		adhaarNumber.append(".txt");
		File f = new File("F:\\harshini\\work\\Task\\ekyc_registration", adhaarNumber.toString());

		f.createNewFile();
		EkycGeneration(f);
	
	}

	public static void EkycGeneration(File f) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		PrintWriter printwriter = new PrintWriter(f);
		System.out.println("enter your name=");
		String name = sc.next();
		printwriter.write("Name = " + name + "\n");

		System.out.println("enter Phone Number=");
		String phno = sc.next();
		printwriter.write("Phone Number = " + phno + "\n");

		System.out.println("enter Alternative Phone Number=");
		String altrphno = sc.next();
		printwriter.write("AlterNative Phone Number = " + altrphno + "\n");

		System.out.println("Present Address");
		printwriter.write("Present Address" + "\n");
		System.out.println("Door no=");
		String doorno = sc.next();
		printwriter.write("Door no = " + doorno + "\n");

		System.out.println("Street/Village =");
		String street = sc.next();
		printwriter.write("Street/Village = " + street + "\n");

		System.out.println("Mandal =");
		String mandal = sc.next();
		printwriter.write("Mandal = " + mandal + "\n");

		System.out.println("District=");
		String dist = sc.next();
		printwriter.write("District = " + dist + "\n");

		System.out.println("State =");
		String state = sc.next();
		printwriter.write("State = " + state + "\n");

		System.out.println("Country =");
		String country = sc.next();
		printwriter.write("Country = " + country + "\n");

		System.out.println("Postal code =");
		String postal = sc.next();
		printwriter.write("Postal code = " + postal + "\n");

		System.out.println("Permanant Address");
		printwriter.write("Permanant Address" + "\n");
		System.out.println("Door no=");
		String doorno1 = sc.next();
		printwriter.write("Door no = " + doorno1 + "\n");

		System.out.println("Street/Village =");
		String street1 = sc.next();
		printwriter.write("Street/Village = " + street1 + "\n");

		System.out.println("Mandal =");
		String mandal1 = sc.next();
		printwriter.write("Mandal = " + mandal1 + "\n");

		System.out.println("District=");
		String dist1 = sc.next();
		printwriter.write("District = " + dist1 + "\n");

		System.out.println("State =");
		String state1 = sc.next();
		printwriter.write("State = " + state1 + "\n");

		System.out.println("Country =");
		String country1 = sc.next();
		printwriter.write("Country = " + country1 + "\n");

		System.out.println("Postal code =");
		String postal1 = sc.next();
		printwriter.write("Postal code = " + postal1 + "\n");

		printwriter.flush();

	}

	public static long numbGen() {
		while (true) {
			long numb = (long) (Math.random() * 1000000000 * 1000000000);
			if (String.valueOf(numb).length() == 12)
				return numb;
		}
	}

	public static StringBuilder getAdhaarNumber() {
		StringBuilder builder = new StringBuilder();
		String[] arr = String.valueOf(numbGen()).split("(?<=\\G.{4})");

		for (int i = 0; i < arr.length; i++) {

			builder.append(arr[i] + " ");

		}
		return builder;
	}

}
