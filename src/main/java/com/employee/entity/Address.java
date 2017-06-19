package com.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	private String id;
	private String street;
	private String apt;
	private String city;
	private String state;
	private String zip;
	private String country;
	
	public Address(){
		this.id= String.valueOf(Math.random());
		this.street=street;		
		this.apt=apt;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.country=country;
		
	}

	public String getId() {
		return id;
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

}
