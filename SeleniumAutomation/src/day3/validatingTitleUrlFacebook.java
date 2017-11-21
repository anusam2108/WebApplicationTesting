package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class validatingTitleUrlFacebook 
{
public static void main(String[] args) 
{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://facebook.com");
		String ExpectedTitle="Facebook log in or signup";
	String ActualTitle=driver.getTitle();
	System.out.println(ExpectedTitle);
	System.out.println(ActualTitle);
	if(ActualTitle.equals(ExpectedTitle))
	{
		System.out.println("Title Mached-PASS");
	}
	else
	{
		System.out.println("Title Not Matches-FAIL");
	}
	System.out.println();
	  
	  
	  String ExpectedUrl="facebook.com";
	  String ActualUrl=driver.getCurrentUrl();
	  
	  System.out.println(ExpectedUrl);
	  System.out.println(ActualUrl);
	  
	  if(ActualUrl.contains(ExpectedUrl))
	  {
	   System.out.println("URL Matched - PASS");
	  }
	  else
	  {
	   System.out.println("URL Not Matched - FAIL");
	  }
	  
	driver.close();
	}

}
