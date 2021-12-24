package com.example.demo.beans;

public class Address {

	private String area,city,state,country,pin;
	public Address() {
	System.out.println("address default constructor");
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin
				+ "]";
	}
	
	
}
