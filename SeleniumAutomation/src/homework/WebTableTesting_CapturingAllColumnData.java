package homework;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebTableTesting_CapturingAllColumnData {

	public static void main(String[] args) {
		 FirefoxDriver driver = new FirefoxDriver();
		  driver.get("https://www.timeanddate.com/worldclock/");
		  
		  driver.manage().window().maximize();
		  String part1="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		  String part2="]/td[1]";
		  
		  for(int i=1;i<=36;i++)
		  {
		   String data=driver.findElement(By.xpath(part1+i+part2)).getText();
		   System.out.println(data);
		  }
		
		  String part3="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		  String part4="]/td[3]";
		  for(int i=1;i<=36;i++)
		  {
			  String data1=driver.findElement(By.xpath(part3+i+part4)).getText();
			  System.out.println(data1);
		  }
		  String part5="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		  String part6="]/td[5]";
		  for(int i=1;i<=36;i++)
		  {
			  String data2=driver.findElement(By.xpath(part5+i+part6)).getText();
			  System.out.println(data2);
		  }
		  String part7="html/body/div[1]/div[8]/section[2]/div[1]/table/tbody/tr[";
		 
		  String part8="]/td[7]";
		  for(int i=1;i<=35;i++)
		  {
			  String data3=driver.findElement(By.xpath(part7+i+part8)).getText();
			  System.out.println(data3);
		  }
	}

}
