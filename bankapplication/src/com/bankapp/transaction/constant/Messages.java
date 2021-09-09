package com.bankapp.transaction.constant;

/**
 * @author Teja Vardhan
 *
 */
public enum Messages {
//	ACF account file
//	BKN bank normal messages
//	AC ACCOUNT
//	D001 deposite
//	WD01 withdraw

	FILENOTFOUND("ACF002", "Given Account not found"), ASKINPUT("BKN01", "Enter Account Number"),
	INSUFFICENTBALANCE("ISB","InSufficent Balance"),AVAILABLEBALANCE("ALBAL","Avaible Balance : "),DRAWMSG("MW001","Enter Money to withDraw"),
 DEPTMSG("DEPTMSG","Enter amount to deposite"),READINGERROR("RERROR","Error occured at reading balance");
	private String msg;
	private String code;

	private Messages(String code, String msg) {
		this.msg = msg;
		this.code = code;

	}

	private Messages(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public static String MessagesCode(String code) {

		Messages[] values = Messages.values();

		for (Messages eachEnum : values) {

			if (eachEnum.getCode().equals(code)) {

				return eachEnum.getMsg();
			}

		}
		return code;

	}

}
