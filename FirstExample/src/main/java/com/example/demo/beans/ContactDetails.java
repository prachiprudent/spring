package com.example.demo.beans;

import com.example.demo.beans.Address;

//POJO class
public class ContactDetails {
	
	private String email,phonenumber;
	
	//ContactDetails has a dependency on Address
	private Address residenceAddr;
	
	
	public ContactDetails() {
	
		System.out.println("contact details default contstructor");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("email setter");
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		System.out.println("phone number setter");
		this.phonenumber = phonenumber;
	}
	
	public void setResidenceAddr(Address residenceAddr) {
		System.out.println("residenceAddr Setter");
		this.residenceAddr = residenceAddr;
	}
	
	public Address getResidenceAddr() {
		return residenceAddr;
	}
	
	@Override
	public String toString() {
	
		return email+" "+phonenumber+"  "+residenceAddr;
	}

}
