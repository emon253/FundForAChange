package com.fund_for_change.domain;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Donation {

	@Id
	private String donationId;
	private String transectionService;
	private String amount;
	//private Timestamp timestamp;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Event event;
	
	public Donation() {
		
	}

	public Donation(String donationId, String transectionService, String amount, User user, Event event) {
 		this.donationId = donationId;
		this.transectionService = transectionService;
		this.amount = amount;
		this.user = user;
		this.event = event;
	}

	public String getDonationId() {
		return donationId;
	}

	public void setDonationId(String donationId) {
		this.donationId = donationId;
	}

	public String getTransectionService() {
		return transectionService;
	}

	public void setTransectionService(String transectionService) {
		this.transectionService = transectionService;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
}
