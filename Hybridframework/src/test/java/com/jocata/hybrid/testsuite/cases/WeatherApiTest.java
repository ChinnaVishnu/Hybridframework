package com.jocata.hybrid.testsuite.cases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
@SuppressWarnings("deprecation")

public class WeatherApiTest {
	
	
	
	private WebDriver driver;
	private String baseUrl;
	@Before
	public void setUp() throws Exception {
		  driver = new FirefoxDriver();
		    baseUrl = "http://openweathermap.org/current";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }
	

	@After
	public void tearDown() throws Exception {
		 driver.close();
		 driver.quit();
	}

	@Test
	public void test() throws ClientProtocolException, IOException {
	driver.get("http://openweathermap.org/current");
	driver.navigate().to("http://api.openweathermap.org/data/2.5/weather?q=London");	
	 WebElement webElement=driver.findElement(By.tagName("pre"));
	 WeatherApiResponse weatherApiResponse=new WeatherApiResponse();
	 String ExpectedString=weatherApiResponse.GetResponse();
	 Assert.assertTrue(webElement.getText().equals(ExpectedString));
	}
}
