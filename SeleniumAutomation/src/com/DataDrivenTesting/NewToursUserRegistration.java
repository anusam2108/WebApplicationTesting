package com.DataDrivenTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class NewToursUserRegistration {
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
	 public void UserCreation()
	 {
	  driver.findElementByName("firstName").sendKeys("Anu");
	  driver.findElement(By.name("lastName")).sendKeys("Meenu");
	  driver.findElement(By.name("phone")).sendKeys("7777777");
	  driver.findElement(By.id("userName")).sendKeys("anumeenu@gmail.com");
	  driver.findElement(By.name("address1")).sendKeys("HiTechCity");
	  driver.findElement(By.name("city")).sendKeys("Hyderbad");
	  driver.findElement(By.name("state")).sendKeys("Telangana");
	  driver.findElement(By.name("postalCode")).sendKeys("50001");
	  driver.findElement(By.name("country")).sendKeys("INDIA");
	  driver.findElement(By.id("email")).sendKeys("MeenuAnu");
	  driver.findElement(By.name("password")).sendKeys("abc123");
	  driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
	  
	  Sleeper.sleepTightInSeconds(10);
	  
	  driver.findElement(By.name("register")).click();
	  
	  String ExpectedUsername = "MeenuAnu";
	  
	  String ActualText= driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
	  
	  System.out.println(ExpectedUsername);
	  System.out.println(ActualText);
	  
	  if(ActualText.contains(ExpectedUsername))
	  {
	   System.out.println("User Registered Successfuly -- PASS");
	  }
	  else
	  {
	   System.out.println("User Not Registered Successfuly - FAIL");
	  }
	   
	   
	}
	 
	 @AfterTest
	 public void tearDown()
	 {
	  driver.close();
	 }
	 
}
