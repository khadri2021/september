package com.bankapp.ekyc.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.bankapp.constants.EkycConstants;
import com.bankapp.ekyc.aadhar.AadharGeneration;
import com.bankapp.ekyc.io.FileUserInput;
import com.bankapp.ekyc.io.GenerateEkycFile;
import com.bankapp.ekyc.pojo.EkycRegrestration;

public class EkycMain {
	Scanner sc = new Scanner(System.in);
	EkycMain ekycmain=new EkycMain();
	public static void main(String[] args) throws IOException {
		System.out.println("######## Ekyc Registration ###########");
		StringBuilder adhaarNumber = AadharGeneration.getAdhaarNumber();
		System.out.println(adhaarNumber.toString());
		adhaarNumber.append(".txt");
		File f = new File(EkycConstants.EKYC_PATH,adhaarNumber.toString());

		f.createNewFile();
		EkycGeneration(f);

	}

	public static void EkycGeneration(File f) throws FileNotFoundException {
		FileUserInput fi = new FileUserInput();
		EkycRegrestration ekyc=fi.prepareRegrestration();
		
		GenerateEkycFile generateEkycFile = new GenerateEkycFile();
		generateEkycFile.prepareFile(f,ekyc );
		
		System.out.println("##########Ekyc Registration Successfull!###########");
		
		
		
	}


		}


