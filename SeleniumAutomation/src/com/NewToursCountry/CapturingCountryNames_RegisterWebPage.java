
package com.NewToursCountry;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingCountryNames_RegisterWebPage {
	 FirefoxDriver driver;
	 
	 @BeforeTest
	 public void setUp()
	 {
	   driver = new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com");
	  
	  driver.manage().window().maximize();
	 }
	 
	 @Test(priority=1)
	 public void Register()
	 {
	  driver.findElement(By.linkText("REGISTER")).click();
	 }
	 
	 @Test(priority=2)
	 public void CountryNames()
	 {
	  WebElement Country= driver.findElement(By.name("country"));
	  List<WebElement>CountryNames=Country.findElements(By.tagName("option"));
	  
	  System.out.println(CountryNames.size());
	  
	  for(int i=0;i<CountryNames.size();i++)
	  {
	   String Name= CountryNames.get(i).getText();
	   System.out.println(Name);
	  }
	 }
	 
	 @AfterTest
	 public void tearDown()
	 {
	  driver.close();
	 }
	 
}
