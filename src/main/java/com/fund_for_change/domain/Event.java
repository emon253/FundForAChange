package com.fund_for_change.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity

public class Event {

	@Id
	private String eventId;
	
	private String eventName;
	
	private String description;
	
	private String place;
	
	private double targetAmount;
	
	private double receivedAmount;
	
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonManagedReference
	private User user;
	
	public Event() {
		 
	}



	public Event(String eventId, String eventName, String description, String place, double targetAmount,
			double receivedAmount, String status, User user) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.description = description;
		this.place = place;
		this.targetAmount = targetAmount;
		this.receivedAmount = receivedAmount;
		this.status = status;
		this.user = user;
	}



	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(double targetAmount) {
		this.targetAmount = targetAmount;
	}

	public double getReceivedAmount() {
		return receivedAmount;
	}

	public void setReceivedAmount(double receivedAmount) {
		this.receivedAmount = receivedAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	public String getStates() {
		return status;
	}



	public void setStates(String status) {
		this.status = status;
	}
	
	
}
