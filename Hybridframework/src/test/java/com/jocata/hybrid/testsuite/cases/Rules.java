package com.jocata.hybrid.testsuite.cases;

import org.testng.annotations.BeforeMethod;

import com.jocata.hybrid.commons.pageobjects.Loginpage;
import com.jocata.hybrid.testsuite.base.BaseSetup;


public class Rules extends BaseSetup  {

	@BeforeMethod
	public void smiple(){
		Loginpage login=new Loginpage(driver);
		
		login.clicklogin();
    	String Email=environment.getProperty("email");
    	String Password=environment.getProperty("password");

	}
}
