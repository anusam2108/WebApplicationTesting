package day9;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PerformClickOperationOnHeaderBlockLinks_TSRTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://www.tsrtconline.in/oprs-web/");
		  
		  WebElement HeaderBlock= driver.findElement(By.xpath("html/body/div[3]"));
		  List<WebElement>HeaderBlockLinks= HeaderBlock.findElements(By.tagName("a"));
		  
		  System.out.println(HeaderBlockLinks.size());
		  
		  for(int i=0;i<HeaderBlockLinks.size();i++)
		  {
		   String headerBlockLinkName= HeaderBlockLinks.get(i).getText();
		   System.out.println(headerBlockLinkName);
		   
		   HeaderBlockLinks.get(i).click();
		   System.out.println(driver.getTitle());
		   System.out.println(driver.getCurrentUrl());
		   System.out.println();
		   
		   driver.navigate().back();
		   HeaderBlock= driver.findElement(By.xpath("html/body/div[3]"));
		   HeaderBlockLinks= HeaderBlock.findElements(By.tagName("a"));
		   
		   
		  }
		  
		  driver.close();

	}

}
