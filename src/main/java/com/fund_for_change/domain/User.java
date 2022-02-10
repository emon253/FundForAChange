package com.fund_for_change.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	private String userId;
	private String userName;
	private String fullName;
	private String userEmail;
	private Long userPhone;
	private String role;
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private List<Donation> donations;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
	private List<Event> events;

	
	
	public User() {
		
	}



	public User(String userId, String userName, String fullName, String userEmail, Long userPhone, String role,
			String password, List<Donation> donations, List<Event> events) {

		this.userId = userId;
		this.userName = userName;
		this.fullName = fullName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.role = role;
		this.password = password;
		this.donations = donations;
		this.events = events;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public Long getUserPhone() {
		return userPhone;
	}



	public void setUserPhone(Long userPhone) {
		this.userPhone = userPhone;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public List<Donation> getDonations() {
		return donations;
	}



	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}



	public List<Event> getEvents() {
		return events;
	}



	public void setEvents(List<Event> events) {
		this.events = events;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", fullName=" + fullName + ", userEmail="
				+ userEmail + ", userPhone=" + userPhone + ", role=" + role + ", password=" + password + ", donations="
				+ donations + ", events=" + events + "]";
	}


	
}
