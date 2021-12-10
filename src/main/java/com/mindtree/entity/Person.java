package com.mindtree.entity;

public class Person {
	private Passport passport;
	private int personid;
	private String personName;
	private String birthPlace;
	private int age;
	
	
	public Person() {
	}
	public Person(String personName, String birthPlace, int age,int personid) {
		this.personid = personid;
		this.personName = personName;
		this.birthPlace = birthPlace;
		this.age = age;
	}
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int passportid) {
		this.personid = passportid;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
		//testing branch
	}

}
