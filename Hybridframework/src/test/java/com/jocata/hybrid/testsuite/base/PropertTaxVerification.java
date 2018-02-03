package com.jocata.hybrid.testsuite.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PropertTaxVerification {

	WebDriver  	driver;
	
	
	@BeforeClass 
	public void init(){
		
		 driver=new FirefoxDriver();
			driver.get("http://evoke-staging.jocatagrid.in/EvokeClient/webservices.jsp?key=58b3263a-d08b-4ea6-a66b-338a8ef6c9c1#");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);     
		
	}	
	
	@Test	
	public void test(){
		
    driver.findElement(By.xpath("//table[@id='SOURCESTABLE']/tbody/tr[5]/td[1]/input")).click();
    
    
   //............................................. 
    driver.findElement(By.xpath("//div[@id='TaxIdDetails']/table/tbody/tr/td[1]/a")).click();
    
    
    driver.findElement(By.xpath("//input[@id='ahm_taxId']")).sendKeys("aaaaa");
    
    
    
    driver.findElement(By.xpath("//button[@id='submit']")).click();
    
    //.......................................pune......................................................................//
    
    
    
    driver.findElement(By.xpath("//div[@id='TaxIdDetails']/table/tbody/tr/td[2]/a")).click();
    
    
WebElement elementpune=    driver.findElement(By.xpath("//select[@id='pune_property_type']"));
    
Select selectpune=new Select(elementpune);

selectpune.selectByVisibleText("P-Peth");


//....................................Section id...............................................................................//


driver.findElement(By.xpath("//input[@id='pune_sectionId']")).sendKeys("bb");



//.........................................Peth ID........................................................//


driver.findElement(By.xpath("//input[@id='pune_pethId']")).sendKeys("ccc");

//...........................................Account No.......................................................................//



driver.findElement(By.xpath("//input[@id='pune_accountNo']")).sendKeys("aaa");



//.............................................Submit...............................................................................//


driver.findElement(By.xpath(".//*[@id='submit']")).click();


//............................................Hyderabad.........................................................................//


driver.findElement(By.xpath("//div[@id='TaxIdDetails']/table/tbody/tr/td[3]/a")).click();


//...............................


WebElement elementcircle=driver.findElement(By.xpath("//select[@id='hyd_circle']"));

Select selectpunecicle=new Select(elementcircle);

selectpunecicle.selectByVisibleText("P-Peth");



driver.findElement(By.xpath("//input[@id='hyd_assessmentNumber']")).sendKeys("");


driver.findElement(By.xpath(".//*[@id='submit']")).click();


//............................................Bangolre...............................................................//




driver.findElement(By.xpath("//div[@id='TaxIdDetails']/table/tbody/tr/td[4]/a")).click();


driver.findElement(By.xpath("//input[@id='sasNumber']")).sendKeys("");


driver.findElement(By.xpath("//input[@id='name']")).sendKeys("");

driver.findElement(By.xpath(".//*[@id='submit']")).click();


//.................................................Chennai.....................................................................//


driver.findElement(By.xpath("//div[@id='TaxIdDetails']/table/tbody/tr/td[5]/a")).click();

driver.findElement(By.xpath(".//*[@id='chn_zone']")).sendKeys("aa");

driver.findElement(By.xpath(".//*[@id='chn_ward']")).sendKeys("bbbb");

driver.findElement(By.xpath(".//*[@id='chn_bill_number']")).sendKeys("ccccc");

driver.findElement(By.xpath(".//*[@id='submit']")).click();


























    
    
    
    
    
    
    
	
}
}