package com.bankapp.ekyc.aadhar;

public class AadharGeneration {
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
 
			builder.append(arr[i] + "-");

		}
		return builder;
	}

	
}