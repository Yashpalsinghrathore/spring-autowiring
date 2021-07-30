package com.spring.autowiring;

public class Student {

	int id;
	int roll;
	String name;
	Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		
		System.out.println("setting address through setter injection");
		
		this.address = address;
	}
	
	
	public Student(int id, int roll, String name, Address address) {
		
		super();
		System.out.println("setting address through constructor");
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", roll=" + roll + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
}
