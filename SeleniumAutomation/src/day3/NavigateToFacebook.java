package day3;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToFacebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
		driver.getTitle();
		
		//System.out.println(driver.getTitle());

		//driver.get("http://skype.com");
		driver.navigate().to("http://gmail.com"); 
		
		driver.getTitle();
		
		System.out.println(driver.getTitle());
		
       driver.close();
	}
}