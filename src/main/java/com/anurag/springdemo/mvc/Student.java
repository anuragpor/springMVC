package com.anurag.springdemo.mvc;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	
	private String country;
	private String favouriteLanguage;
	private String[] operatingSystems;
	
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	private HashMap<String, String> countryOptions;
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student() {
		countryOptions = new HashMap<>();
		
		countryOptions.put("Br", "Brazil");
		countryOptions.put("Fr", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("Us", "USA");
	}

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
