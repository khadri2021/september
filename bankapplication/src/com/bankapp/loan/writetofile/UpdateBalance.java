package com.bankapp.loan.writetofile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.bankapp.transaction.constant.Constant;

public class UpdateBalance {

	public void updateBalance(String accountNumber, int remainingBalace, ArrayList<?>  arrayList) throws IOException {
		File accountFile = new File(Constant.filepath + accountNumber + Constant.extenstion);
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(accountFile));
		bufferedWriter.write(arrayList.get(0) + "\n");
		bufferedWriter.write(arrayList.get(1) + "\n");
		bufferedWriter.write(Constant.BALANCE + "=" + remainingBalace + "\n");
		bufferedWriter.write(arrayList.get(3) + "\n");
		bufferedWriter.close();

	}

}
