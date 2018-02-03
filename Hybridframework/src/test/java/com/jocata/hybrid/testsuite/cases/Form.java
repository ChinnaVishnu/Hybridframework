package com.jocata.hybrid.testsuite.cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.JsonParser;

public class Form {

	WebDriver driver;
	
	@BeforeClass 
	public void init(){
		
		
		/*FirefoxProfile profile = new FirefoxProfile();

		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.http", "localhost");
		profile.setPreference("network.proxy.port", 1234);*/

		    driver=new 	FirefoxDriver();
			driver.get("http://evoke-staging.jocatagrid.in/EvokeClient/webservices.jsp?key=58b3263a-d08b-4ea6-a66b-338a8ef6c9c1#");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);     
		
	}	
	
	@Test	
	public void test() throws InterruptedException, IOException{	
		System.out.println("Hi test");


	driver.findElement(By.xpath("//table[@id='SOURCESTABLE']/tbody/tr[3]/td[4]/input")).click();
	
	Thread.sleep(4000);
	WebElement elementid=driver.findElement(By.xpath(".//*[@id='idType']"));
		
	Select selectformk=new Select(elementid);

	selectformk.selectByVisibleText("Water Bill Info");
	Thread.sleep(4000);
	
	
	WebElement elementstate=driver.findElement(By.xpath(".//*[@id='wbstate']"));
	
	Select selectstate=new Select(elementstate);

	selectstate.selectByVisibleText("Telangana");
	
	
	
	driver.findElement(By.xpath(".//*[@id='voterId']")).sendKeys("51215950");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath(".//*[@id='json']/div[12]/table/tbody/tr/td[2]/div/input")).click();
	
	
	
	/*JSONObject jsonobject
	
	JsonParser parser = new JsonParser();
	
	WebElement json=driver.findElement(By.tagName("pre"));
	
	
	try{
		
		String text=json.getText();
		Pattern pattern=pattern.compile("\\{.+\\}");
		
		Matcher matcher=pattern.matcher(text);
		matcher.find();
		
		
		String jsonString =text.substring(matcher.start(), matcher.end());
		 
		jsonobject=(JSONObject)parser.parse(jsonString);
		
		boolean error=(boolean)jsonobject.get("error");
		
		if (error==true) {
			System.out.println("CEP invalid");
		}
		else{
			System.out.println("CEP  notValid");
		}
		
		
	}
	catch(Exception e){
		
		e.printStackTrace();
		
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	String actual=driver.findElement(By.tagName("pre")).getText();
	System.out.println(actual);
	
	
	
	
	
	
	//String actual=""

	/*String actual=driver.findElement(By.xpath("//pre[@id='reslut']")).getText();
	System.out.println(actual+"hi");

	JsonParser parser = new JsonParser();
	JSONObject jo = new JSONObject();
	jo.put("result", "Record not available");
	jo.put("lastName", "WATER");
*/


    /*StringWriter out = new StringWriter();
    jo.writeJSONString(out);
    
    String jsonText = out.toString();
    System.out.print(jsonText);
*/


/*
JSONObject obj = new JSONObject();

System.out.println(obj.getString("name")); //John
*/




	//System.out.println(telno);
	/*JSONObject obj = new JSONObject();

    obj.put("result", "Record not available");
    obj.put("idType", "WATER");
    obj.put("waterBillId", 51215950);
    obj.put("customerId",34344);
	*/
    
    
   /* JsonParser parser = new JsonParser();
    JsonElement o1 = parser.parse(obj);
    JsonElement o2 = parser.parse("{\"cmd\":1,\"state\":1}");
    System.out.println(o1.equals(o2));*/
	
/*	String excepted="{
   "result": "Record not available",
   "idType": "WATER",
   "waterBillId": "51215950",
   "customerId": "34344",
   "state": "TG",
   "version": "1.0",
   "statusCode": "5"
}";
*/
  
   /* JavascriptExecutor js = (JavascriptExecutor) dw2;
    js.executeScript("document.getElementsByTagname('textarea')[0].value='"
        + <your json string> + "'");

    
    
String jsonInput = "{\"result\":\"Record not available\",\"idType\":\"WATER\",\"waterBillId\":\"51215950\",\"customerId\":\"34344\",\"state\":\"TG\",\"waterBillId\":\"51215950\",\"waterBillId\":\"51215950\"}";//Read input Here

JSONObject 	jsonobject;
JsonParser parser1 = new JsonParser();
       driver.findElement(By.tagName("pre"));*/






/*JSONReader reader = new JSONValidatingReader();
Object result = reader.read(jsonInput);
System.out.println("Validation Success !!");
*/
	
	
		
	}
}

