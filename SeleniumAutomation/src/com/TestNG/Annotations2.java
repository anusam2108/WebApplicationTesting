package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeTest
	 public void ApplicationlaunchAndLogIn()
	 {
	  System.out.println("This is used to LogIn to application");
	 }
	 
	 
	 @Test(priority=1)
	 public void Compose()
	 {
	  System.out.println(" This is used to compose Mail");
	 }
	 
	 @Test(priority=2)
	 public void SentMail()
	 {
	  System.out.println("This is use to Test Sent Mail ");
	 
	 }
	 
	 @AfterTest
	 public void ApplicationClose()
	 {
	  System.out.println("This will close the Application");
	 }

}
