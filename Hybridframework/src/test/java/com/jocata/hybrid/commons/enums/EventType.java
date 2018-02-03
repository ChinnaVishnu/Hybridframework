package com.jocata.hybrid.commons.enums;

public enum EventType {

	
	USER("User"),
	SITE("Site");
	private String value;
	private EventType(String value){
		this.value  = value;
	}
	
	public String getValue(){
		return value;
	}
}
