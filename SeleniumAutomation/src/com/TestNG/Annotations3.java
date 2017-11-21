package com.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Annotations3 {
	 @BeforeMethod
	 public void ApplicationLaunch()
	 {
	  System.out.println("This is used to Launch the Application");
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
	 
	 @AfterMethod()
	 public void ApplicaitonClose()
	 {
	  System.out.println("This will close the Application");
	 }
	 
	 

}
