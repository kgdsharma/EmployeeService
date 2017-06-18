package com.employee.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {
	
	@Id
    private String employeeId;
	private String name;
	private String email;
	private String street;
	private String apt;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String phone;
	
	//public Employee(){}
	
	public Employee(){
		this.employeeId=employeeId;
		this.name=name;
		this.email=email;
		this.street=street;
		this.apt=apt;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.country=country;
		this.phone=phone;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getStreet() {
		return street;
	}

	public String getApt() {
		return apt;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getCountry() {
		return country;
	}

	public String getPhone() {
		return phone;
	}

}
