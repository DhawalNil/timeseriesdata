package com.infy.timeseries.dto;

import java.time.LocalDateTime;

public class EntityDTO {
	
	LocalDateTime timestamp;
	Integer personId;
	Integer eventId;
	PersonDTO person;
	String eventType;
	LocalDateTime created;
	LocalDateTime raised;
	LocalDateTime subscribed;
	LocalDateTime handled;
	LocalDateTime processed;
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public Integer getEventId() {
		return eventId;
	}
	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	public PersonDTO getPerson() {
		return person;
	}
	public void setPerson(PersonDTO person) {
		this.person = person;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public LocalDateTime getCreated() {
		return created;
	}
	public void setCreated(LocalDateTime created) {
		this.created = created;
	}
	public LocalDateTime getRaised() {
		return raised;
	}
	public void setRaised(LocalDateTime raised) {
		this.raised = raised;
	}
	public LocalDateTime getSubscribed() {
		return subscribed;
	}
	public void setSubscribed(LocalDateTime subscribed) {
		this.subscribed = subscribed;
	}
	public LocalDateTime getHandled() {
		return handled;
	}
	public void setHandled(LocalDateTime handled) {
		this.handled = handled;
	}
	public LocalDateTime getProcessed() {
		return processed;
	}
	public void setProcessed(LocalDateTime processed) {
		this.processed = processed;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "EntityDTO [timestamp=" + timestamp + ", personId=" + personId + ", eventId=" + eventId + ", person="
				+ person + ", eventType=" + eventType + ", created=" + created + ", raised=" + raised + ", subscribed="
				+ subscribed + ", handled=" + handled + ", processed=" + processed + "]";
	}
	
}
