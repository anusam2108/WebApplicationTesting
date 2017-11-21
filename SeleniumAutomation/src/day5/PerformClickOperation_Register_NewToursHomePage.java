package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PerformClickOperation_Register_NewToursHomePage {

	public static void main(String[] args) {
		  FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com");
		  
		  driver.findElement(By.linkText("REGISTER")).click();
		  
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  
		  driver.close();
	}

}
