package homework;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
public class AllScreenShotsNewTours {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		FirefoxDriver driver= new FirefoxDriver();
		  driver.get("http://newtours.demoaut.com");
		  
		  List<WebElement>links= driver.findElements(By.tagName("a"));
		  
		  System.out.println(links.size());
		  
		  for(int i=0;i<links.size();i++)
		  {
		   String LinkName= links.get(i).getText();
		   System.out.println(LinkName);
		   
		   links.get(i).click();
		   
		   System.out.println(driver.getTitle());
		   System.out.println(driver.getCurrentUrl());
		   
		   driver.navigate().back();
		   links= driver.findElements(By.tagName("a"));
		   Thread.sleep(5000);
			  
			  File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileUtils.copyFile(srcFile, new File("C:\\Users\\Avalon\\Desktop\\AnuImage\\Nt.png"));
		   
		  }
		  driver.close();
	}

}
