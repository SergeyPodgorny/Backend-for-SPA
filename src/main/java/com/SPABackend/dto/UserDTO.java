package com.SPABackend.dto;

import com.SPABackend.entity.User;

public class UserDTO {
	
	private String name;
	
	private String lastName;	
	
	private String userName;
	
	private String email;
	
	private String webSite;
	
	private String phoneNumber;
	
	private String street;
	
	private String suite;
	
	private String city;
	
	private String zipCode;
	
	private String latitude;
	
	private String longitude;

	

	public UserDTO(String name, String lastName, String userName, String email, String webSite, String phoneNumber,
			String street, String suite, String city, String zipCode, String latitude, String longitude) {
		this.name = name;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipCode = zipCode;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public UserDTO(User user) {
		name = user.getName();
		lastName = user.getLastName();
		userName = user.getUserName();
		email = user.getEmail();
		webSite = user.getWebSite();
		phoneNumber = user.getPhoneNumber();
		street = user.getStreet();
		suite = user.getSuite();
		city = user.getCity();
		zipCode = user.getZipCode();
		latitude = user.getLatitude();
		longitude = user.getLongitude();
	}
	
	public UserDTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
	
}
