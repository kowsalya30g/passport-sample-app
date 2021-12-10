package com.mindtree.entity;

public class Passport {
	private int Personid;
	private String PassportNo;
	
	public Passport(int personid, String passportNo) {
		Personid = personid;
		PassportNo = passportNo;
	}

	public Passport() {}

	public int getPersonid() {
		return Personid;
	}

	public void setPersonid(int personid) {
		Personid = personid;
	}

	public String getPassportNo() {
		return PassportNo;
	}

	public void setPassportNo(String passportNo) {
		PassportNo = passportNo;
	}
	//testing
	

}
