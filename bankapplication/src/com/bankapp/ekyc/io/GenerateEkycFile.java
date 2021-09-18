package com.bankapp.ekyc.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import com.bankapp.ekyc.pojo.EkycRegrestration;

public class GenerateEkycFile {
	
	public void prepareFile(File f,EkycRegrestration ekyc) throws FileNotFoundException {
		
		PrintWriter printwriter = new PrintWriter(f);

		
		printwriter.write("Name = " + ekyc.getName() + "\n");

		printwriter.write("Phone Number = " +ekyc.getPhno() + "\n");

		printwriter.write("AlterNative Phone Number = " + ekyc.getAltrphno() + "\n");

		printwriter.write("Present Address :" + "\n");
		
		printwriter.write("Door no = " + ekyc.getPresentAddress().getDoorno() + "\n");

		printwriter.write("Street/Village = " + ekyc.getPresentAddress().getStreet() + "\n");

		printwriter.write("Mandal = " + ekyc.getPresentAddress().getMandal() + "\n");

		printwriter.write("District = " + ekyc.getPresentAddress().getDist() + "\n");

		printwriter.write("State = " + ekyc.getPresentAddress().getState() + "\n");

		printwriter.write("Country = " + ekyc.getPresentAddress().getCountry() + "\n");

		printwriter.write("Postal code = " +ekyc.getPresentAddress().getPostal() + "\n");

		printwriter.write("Permanant Address :" + "\n");
		printwriter.write("Door no = " +ekyc.getPermanantAddress().getDoorno() + "\n");

		printwriter.write("Street/Village = " +ekyc.getPermanantAddress().getStreet()+ "\n");

		printwriter.write("Mandal = " +ekyc.getPermanantAddress().getMandal()+ "\n");

		printwriter.write("District = " +ekyc.getPermanantAddress().getDist() + "\n");

		printwriter.write("State = " +ekyc.getPermanantAddress().getState()+ "\n");

		printwriter.write("Country = " + ekyc.getPermanantAddress().getCountry() + "\n");

		printwriter.write("Postal code = " +ekyc.getPermanantAddress().getPostal() + "\n");

		printwriter.flush();

		
	}

}
