package com.bankapp.ekyc.io;

import java.util.Scanner;

import com.bankapp.ekyc.pojo.EkycRegrestration;

public class FileUserInput {


	public EkycRegrestration prepareRegrestration() {
		
		EkycRegrestration ekyc = new EkycRegrestration();

		
		System.out.println("enter your name=");
		ekyc.setName(userInput());
		
		System.out.println("enter Phone Number=");
		//String phno = sc.next();
		ekyc.setPhno(userInput());
		
		System.out.println("enter Alternative Phone Number=");
        ekyc.setAltrphno(userInput());
        
		System.out.println("Present Address :");
		System.out.println("Door no=");
        ekyc.getPresentAddress().setDoorno(userInput());

		System.out.println("Street/Village =");
		ekyc.getPresentAddress().setStreet(userInput());
		
		System.out.println("Mandal =");
        ekyc.getPresentAddress().setMandal(userInput());
        
		System.out.println("District=");
		ekyc.getPresentAddress().setDist(userInput());
		
		System.out.println("State =");
       ekyc.getPresentAddress().setState(userInput());
       
		System.out.println("Country =");
        ekyc.getPresentAddress().setCountry(userInput());
        
		System.out.println("Postal code =");
        ekyc.getPresentAddress().setPostal(userInput());
        
		System.out.println("Permanant Address");
		System.out.println("Door no=");
        ekyc.getPermanantAddress().setDoorno(userInput());
        
		System.out.println("Street/Village =");
        ekyc.getPermanantAddress().setStreet( userInput());
        
		System.out.println("Mandal =");
        ekyc.getPermanantAddress().setMandal( userInput());
        
		System.out.println("District=");
        ekyc.getPermanantAddress().setDist(userInput());
        
		System.out.println("State =");
        ekyc.getPermanantAddress().setState( userInput());
        
		System.out.println("Country =");
        ekyc.getPermanantAddress().setCountry(userInput());
        
		System.out.println("Postal code =");
        ekyc.getPermanantAddress().setPostal(userInput());
		
		return ekyc;
	}
	public static String userInput() {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		return name;
	} 
}
