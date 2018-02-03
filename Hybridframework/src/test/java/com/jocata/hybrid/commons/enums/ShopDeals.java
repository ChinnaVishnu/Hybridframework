package com.jocata.hybrid.commons.enums;

public enum ShopDeals {

	
	COUPONS("Coupons");
	private String bharath ;
	private ShopDeals(String option) {
		this.bharath = option;
	}
	
	public String getOption(){
		return bharath;
	}
}
