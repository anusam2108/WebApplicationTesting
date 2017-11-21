package day3;
import org.openqa.selenium.firefox.FirefoxDriver;
public class CapturingURLFacebook 
{
public static void main(String[] args)
{
FirefoxDriver driver = new FirefoxDriver();
driver.get("http://facebook.com");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
driver.close();
//if driver.getCurrentUrl()==driver.getTitle();

}

}
