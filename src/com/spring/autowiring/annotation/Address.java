package com.spring.autowiring.annotation;

public class Address {

	String city;

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}
}
