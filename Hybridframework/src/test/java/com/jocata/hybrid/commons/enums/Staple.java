package com.jocata.hybrid.commons.enums;

public enum Staple {
	
SEARCH("StoreLocation1");
	
	private String value;
	private Staple(String value){
		this.value  = value;
	}
	
	public String getValue(){
		return value;
	}


}
