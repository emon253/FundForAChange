package com.fund_for_change.dto;

public class EventDTO {
	private String eventName;
	private String eventDescriction;
	private String eventLocation;
	private double targetAmount;
	public EventDTO(String eventName, String eventDescriction, String eventLocation, double targetAmount) {
		this.eventName = eventName;
		this.eventDescriction = eventDescriction;
		this.eventLocation = eventLocation;
		this.targetAmount = targetAmount;
	}
	public EventDTO() {
	
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDescriction() {
		return eventDescriction;
	}
	public void setEventDescriction(String eventDescriction) {
		this.eventDescriction = eventDescriction;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	public double getTargetAmount() {
		return targetAmount;
	}
	public void setTargetAmount(double targetAmount) {
		this.targetAmount = targetAmount;
	}
	@Override
	public String toString() {
		return "EventDTO [eventName=" + eventName + ", eventDescriction=" + eventDescriction + ", eventLocation="
				+ eventLocation + ", targetAmount=" + targetAmount + "]";
	}

}
