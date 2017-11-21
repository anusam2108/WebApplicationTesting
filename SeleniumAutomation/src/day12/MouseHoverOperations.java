package day12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
public class MouseHoverOperations {
	public static void main(String[] args) 
	 {
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("http://flipkart.com");
	  
	  driver.manage().window().maximize();
	  
	  Actions act = new Actions(driver);
	  
	  WebElement Electronics = driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/a/span"));
	  
	  act.moveToElement(Electronics).perform();
	  
	  Sleeper.sleepTightInSeconds(10);
	  
	  driver.findElement(By.xpath("html/body/div[1]/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span")).click();
	  
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
	  
	  driver.close();

	 }

}
