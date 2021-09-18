package com.bankapp.onboard.validation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bankapp.constants.EkycConstants;
import com.bankapp.transaction.constant.Constant;

/**
 * @author Teja Vardhan
 *
 */
public class EkycService {
	private static Scanner sc;

	public static String checkE_kyc() throws IOException {
		String aadharNo = null;
		sc = new Scanner(System.in);
		System.out.println("Enter AdharNumber");
		String aadharNumber = sc.next();
        new File(EkycConstants.EKYC_PATH).mkdir();
		File f = new File(EkycConstants.EKYC_PATH + aadharNumber + Constant.extenstion);
		if (f.exists()) {

			System.out.println("Congrats Ekyc Completed");
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line;
			String Separater = "[=?]";
			while ((line = br.readLine()) != null) {
				String[] split = line.split(Separater);
				String aadhar = split[Constant.ZERO];
				if (aadhar.equals(Constant.ADHAARNO)) {
					aadharNo = split[Constant.ONE];
				}
			}
			br.close();
			return aadharNo;
		} else {
			System.out.println("AdharNumber Invalid ! Try again.");
			EkycService.checkE_kyc();
		}
		return aadharNo;
	}

}
