package com.bankapp.transaction.file.operation;

import java.io.IOException;
import java.io.PrintWriter;

import com.bankapp.transaction.constant.Constant;

/**
 * @author Teja Vardhan
 *
 */
public class WriteFile {

		public void writeIntoFile(String accountNumber,String balance,String pin) {
			try {
				PrintWriter pw = new PrintWriter(
						Constant.filepath + accountNumber + Constant.extenstion);
				pw.write(Constant.ACCOUNT_NUMBER+"="+accountNumber);
				pw.println();
				pw.write(Constant.PIN+"="+pin);
				pw.println();
				pw.write(Constant.BALANCE+"="+balance);
				pw.println();
				pw.close();
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("Unable to write into file");
			}
		}

}


