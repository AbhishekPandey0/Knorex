package com.knorex.model;

public class TrackingEvent {
	
    private String eventType;
    private String eventUrl;
    
    public TrackingEvent() {
    	super();
    }

	public TrackingEvent(String eventType, String eventUrl) {
		super();
		this.eventType = eventType;
		this.eventUrl = eventUrl;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventUrl() {
		return eventUrl;
	}

	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}

	@Override
	public String toString() {
		return "TrackingEvent [eventType=" + eventType + ", eventUrl=" + eventUrl + "]";
	}
}
