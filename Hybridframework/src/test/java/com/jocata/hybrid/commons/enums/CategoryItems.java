package com.jocata.hybrid.commons.enums;

/**
 * @author asus
 *
 */
public enum CategoryItems {


	HEADPHONES("electronics","#shop-Cat-audiotvstreamingmedia","Headphones"),
	FILLERPAPER("officesupplies","#shop-Cat-paperstationery","Filler Paper"),
	BINDERS("officesupplies","Binders");
	
	private String cat;
	private String subcat;
	private String childcat;
	private String type;
	
	CategoryItems(String subcat,String childcat,String type){
		this.subcat = subcat;
		this.childcat=childcat;
		this.type=type;
	}
	CategoryItems(String subcat,String type){
		this.subcat = subcat;
		this.childcat="";
		this.type=type;
	}
	public String getCat() {
		return cat;
	}

	public String getSubcat() {
		return subcat;
	}

	public String getChildcat() {
		return childcat;
	}

	public String getType() {
		return type;
	}
	
	
}
