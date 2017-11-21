package day7;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CapturingAllLinkNames_NewTours_HomePage {

	public static void main(String[] args) {
		 FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com");
		  
		  List<WebElement>links = driver.findElements(By.tagName("a"));
		  
		  System.out.println(links.size());
		  
		  for(int i=0;i<links.size();i++)
		  {
		      String LinkName =links.get(i).getText();
		      System.out.println(LinkName);
		  }
		  
		  
		  
		  driver.close();

	}

}
