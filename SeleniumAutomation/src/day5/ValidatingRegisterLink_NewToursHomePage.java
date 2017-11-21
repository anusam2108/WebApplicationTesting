package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ValidatingRegisterLink_NewToursHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com");
		  
		  String ExpectedregisterUrl=driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		  System.out.println(ExpectedregisterUrl);
		  
		  driver.findElement(By.linkText("REGISTER")).click();
		  
		  String ActualURL= driver.getCurrentUrl();
		  System.out.println(ActualURL);
		  
		  if(ActualURL.equals(ExpectedregisterUrl))
		   
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
