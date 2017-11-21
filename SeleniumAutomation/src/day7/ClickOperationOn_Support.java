package day7;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOperationOn_Support {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com");
		  
		  //driver.findElement(By.linkText("SUPPORT")).click();
		  
		  //driver.findElementByLinkText("SUPPORT").click();
		  
		  WebElement support = driver.findElementByLinkText("SUPPORT");
		  
		  support.click();
		  
		  driver.close();

		 }

		}


