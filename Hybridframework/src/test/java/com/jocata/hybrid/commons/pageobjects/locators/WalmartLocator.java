package com.jocata.hybrid.commons.pageobjects.locators;

import org.openqa.selenium.By;

public interface WalmartLocator {

//...................click on my account.................//
	
public By MYACCOUNT=By.xpath("//button[@class='dropdown-link js-flyout-toggle flyout-toggle']");


//.................//a[@title='My Account']

public By SIGNIN=By.xpath("//a[text()='Sign In']");


//..................click on walmart email..................//

public By EMAIL=By.xpath("//input[@name='email']");


//................click on password.................//

public By PASSWORD=By.xpath("//input[@name='password']");

//click on Sumbit................//

public By SUMBIT=By.xpath("//button[text()='Sign In']");



//...........click on All department..................//

public By ALLDEPARTMENTS=By.xpath("//button[@id='department-navigation']");

//.................click on FOOD...................//
public By FOOD=By.xpath("//button[text()='Food, Household & Pets']");

//...............click on snacks..........................//

public By SNACKS=By.xpath("//a[@title='Snacks & Cookies']");







}
