package day11;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TSRTC_ScreenShots_HeaderBlockLinks
{
 public static void main(String[] args) throws IOException,InterruptedException 
 {
  
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
   //Thread.sleep(5000);
   
   File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(srcFile, new File("C:\\Users\\Avalon\\Desktop\\TSRTCScreenShots\\"+headerBlockLinkName+".png"));
   
   
   driver.navigate().back();

   Thread.sleep(5000);
   HeaderBlock= driver.findElement(By.xpath("html/body/div[3]"));
   HeaderBlockLinks= HeaderBlock.findElements(By.tagName("a"));
   
   
  }
  
  driver.close();


 }

}