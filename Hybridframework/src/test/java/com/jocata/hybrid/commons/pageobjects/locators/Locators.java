package com.jocata.hybrid.commons.pageobjects.locators;

import org.openqa.selenium.By;

public interface Locators {

	
	By LOGIN = By.xpath("//a[text()='Log in']");
	/*---------------------------*/
	/* Login Page Locators */ 
	
	By USERNAME= By.id("username");
	By PASSWORD=By.id("password");
	By REMEMBER_ME= By.id("rememberusername");
	By SUBMIT=By.id("loginbtn");
	
	/*---------------------------*/
	
	
	
	
	By NEW_EVENT = By.xpath("//a[text()='New event']");
	
	
	
	By SELECT_EVENT_ELEMENT = By.id("id_eventtype");
	By EVENT_TITLE = By.id("id_name");
	By EVENT_DESCRIPTION= By.id("id_descriptioneditable");
	
	By EVENT_DAY=By.id("id_timestart_day");
	By EVENT_MONTH= By.id("id_timestart_month");
	By EVENT_YEAR= By.id("id_timestart_year");
	By EVENT_HOUR=By.id("id_timestart_hour");
	By EVENT_MINUTE=By.id("id_timestart_minute");
	
	By EVENT_DURATION=By.xpath("//a[text()='Duration']");
	By EVENT_WITHOUT_DURARION=By.id("id_duration_0");
	
	By EVENT_REPEATED_HEADING=By.xpath("//a[text()='Repeated events']");
	By EVENT_REPEATED_CHECK=By.id("id_repeat");
	
	By EVENT_SAVE_CHANGES= By.xpath("//input[@value='Save changes']");
}
