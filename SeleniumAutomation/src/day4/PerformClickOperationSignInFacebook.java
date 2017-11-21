package day4;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class PerformClickOperationSignInFacebook {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		  driver.get("http://facebook.com");
		  
		  driver.findElement(By.id("loginbutton")).click();
	}

}
