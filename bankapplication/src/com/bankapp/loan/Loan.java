package com.bankapp.loan;
import java.io.File;

public class Loan {
	
	public static void main(String[] args)
	{
		File f=new File("C:\\bankapplication\\ekyc_registration\\Loan");
		if(f.exists())
			System.out.println("Exists");
		else
		System.out.println("Does not exists");
		
	}

}
