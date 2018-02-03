package com.jocata.hybrid.commons.pageobjects.locators;

import org.openqa.selenium.By;

public interface StartLocator {

	
//..............................................Login Fuctionality.......................................................//
	
public By  Username= By.xpath("//input[@id='userName']");
public By Password=By.xpath("//input[@id='password']");
public By Login=By.xpath("//span[@id='loginButtonExt-btnIconEl']");



	
}
