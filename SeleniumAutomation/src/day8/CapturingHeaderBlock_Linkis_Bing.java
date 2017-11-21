package day8;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CapturingHeaderBlock_Linkis_Bing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://bing.com");
		  
		  WebElement HeaderBlock= driver.findElement(By.id("sc_hdu"));
		  List<WebElement>HeaderLinks= HeaderBlock.findElements(By.tagName("a"));
		  
		  System.out.println(HeaderLinks.size());
		  
		  driver.close();
	}

}
