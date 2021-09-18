package com.bankapp.ekyc.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.bankapp.ekyc.aadhar.AadharGeneration;
import com.bankapp.ekyc.io.FileUserInput;
import com.bankapp.ekyc.io.GenerateEkycFile;
import com.bankapp.ekyc.pojo.EkycRegrestration;

public class EkycMain {
	Scanner sc = new Scanner(System.in);
	EkycMain ekycmain = new EkycMain();

	public static void main(String[] args) throws IOException {
		System.out.println("######## Ekyc Registration ###########");
		StringBuilder adhaarNumber = AadharGeneration.getAdhaarNumber();
		System.out.println(adhaarNumber.toString());
		String FinaladhaarNumber = new String(adhaarNumber);
		EkycGeneration(FinaladhaarNumber);

	}

	public static void EkycGeneration(String adhaarNumber) throws FileNotFoundException {
		FileUserInput fi = new FileUserInput();
		EkycRegrestration ekyc = fi.prepareRegrestration();

		GenerateEkycFile generateEkycFile = new GenerateEkycFile();
		generateEkycFile.prepareFile(ekyc, adhaarNumber);

		System.out.println("##########Ekyc Registration Successfull!###########");

	}

}
