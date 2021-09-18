package com.bankapp.ekyc.pojo;

public class EkycRegrestration {
	private String name;

	private String phno;

	private String altrphno;
	
	private PermanantAddress permanantAddress = new PermanantAddress();
	
	private PresentAddress presentAddress = new PresentAddress();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getAltrphno() {
		return altrphno;
	}

	public void setAltrphno(String altrphno) {
		this.altrphno = altrphno;
	}

	public PermanantAddress getPermanantAddress() {
		return permanantAddress;
	}

	public void setPermanantAddress(PermanantAddress permanantAddress) {
		this.permanantAddress = permanantAddress;
	}

	public PresentAddress getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(PresentAddress presentAddress) {
		this.presentAddress = presentAddress;
	}

}
