package com.jocata.hybrid.commons.pageobjects.locators;

import org.openqa.selenium.By;

public interface KmartNewLocators {
public By YourAccount =By.xpath("//div[text()='Your Account']");

public By IFrame=By.xpath("//iframe[contains(@id,'easyXDM_default')]");


public By EMAIL=By.xpath(".//*[@id='email']");

public By PASSWORD=By.xpath(".//*[@id='password']");

public By Submit=By.xpath(".//*[@id='universalSignInBtns']/button[1]");




//.................click on health and beauty..............//
	
public By HEALTHBEAUTY=By.xpath("//a[text()='Health & Beauty']");	

//....................click on beauty..................//

public By BEAUTY=By.xpath("//li[@id='gnf_dept_tree_item_6_3_1']/span/a");

//click on............... makeup.....................

public By MAKEUP=By.xpath("//a[text()='Makeup']");

//click on health...................//
public By HEALTH=By.xpath("//li[@id='gnf_dept_tree_item_6_5_1']/span/a");


//click on pharamacy.....................//

public By PHARAMCY =By.xpath("//a[text()='Pharmacy']");

//click on............... nalis........//
public By NALIS=By.xpath("//span[text()='Nails']");

//click on nalis items...................//

public By OPINALIl=By.xpath("//div[@id='results']//div[@id='cards-holder']/div[3]");

//click on addto bag.................//

public By ADDTOBAG=By.xpath("//button[@data-id='addToCart']");

//..................click on shopping bag.......................//


public By GOTOCART=By.xpath("//div[@id='atc-mc-modal']/div[4]/a[1]");


//........click on jewellery....................//

public By JEWELRY=By.xpath("//a[text()='Jewelry']");

///............click on necklaces................//

public By NECKLACES=By.xpath("//p[text()='Necklaces']");


//...................perals.................//

public By PERALS=By.xpath("//span[text()='Pearl Necklaces']");

//..................click on Ameth..................//

public By AMETH=By.xpath("//span[@class='filter-check-box shc-icons checkbox']");

//..............................

public By SILVER=By.xpath("//h3[@class='card-title']/a[text()='Freshwater Pearl Swirl Pendant']");

//.......................second add to bag......................//


public By ADDTOBAGSECOND=By.xpath("//button[@data-id='addToCart']");

//........................click to gotocart....................//


public By GOTOCARTSECOND=By.xpath("//div[@id='atc-mc-modal']/div[4]/a[1]");


//..................click on logout.......................//

public By LOGOUT=By.xpath("//a[text()='Logout']");

}
