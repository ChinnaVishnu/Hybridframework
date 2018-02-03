package com.jocata.hybrid.commons.enums;

public enum MenuItems {
	
	NOTIFICATIONS("Notifications"),
	ADVANCEFETURES("Advanced features"),
	REGISTRATION("Registration");
	
	private String value;
	MenuItems(String value){
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
}
