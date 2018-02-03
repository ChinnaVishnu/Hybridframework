package com.jocata.hybrid.commons.pageobjects;

import org.openqa.selenium.WebDriver;

import com.jocata.hybrid.commons.pageobjects.locators.StartLocator;
import com.jocata.hybrid.commons.selenium.SafeActions;

public class Loginpage extends SafeActions {

	
	WebDriver driver;

	public Loginpage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	public void clicklogin(){
		safeClick(StartLocator.Username, 50);
		safeClick(StartLocator.Password, 50);
		safeClick(StartLocator.Login, 50);
		
		
	}
}
