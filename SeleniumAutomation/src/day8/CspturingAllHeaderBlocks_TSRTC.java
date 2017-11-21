
package day8;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CspturingAllHeaderBlocks_TSRTC 
{
public static void main(String[] args) {
		 FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://www.tsrtconline.in/oprs-web/");
		  WebElement HeaderBlock= driver.findElementByClassName("menu");
		  List<WebElement>HeaderLinks= HeaderBlock.findElements(By.tagName("a"));
         System.out.println(HeaderLinks.size());
  for(int i=0;i<HeaderLinks.size();i++)
  {
      String LinkName =HeaderLinks.get(i).getText();
      System.out.println(LinkName);  
		  driver.close();
	}

}
}
