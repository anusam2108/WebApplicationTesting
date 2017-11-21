package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NavigateToYourAmazon {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://amazon.com");

		  driver.findElement(By.id("nav-your-amazon")).click();
driver.close();
	}

}
