package com.NewToursCountry;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class CapturingCountryNames_RegisterWebPageToExcel {
	 FirefoxDriver driver;
	 
	 @BeforeTest
	 public void setUp()
	 {
	   driver = new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com");
	  
	  driver.manage().window().maximize();
	 }
	 
	 @Test(priority=1)
	 public void Register()
	 {
	  driver.findElement(By.linkText("REGISTER")).click();
	 }
	 
	 @Test(priority=2)
	 public void CountryNames() throws IOException
	 {
	  WebElement Country= driver.findElement(By.name("country"));
	  List<WebElement>CountryNames=Country.findElements(By.tagName("option"));
	  
	  System.out.println(CountryNames.size());
	  
	  FileInputStream file = new FileInputStream("C:\\Users\\Avalon\\Desktop\\AnuTestData.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(file);
	  XSSFSheet ws = wb.getSheet("Sheet1");
	  
	  
	  for(int i=0;i<CountryNames.size();i++)
	  {
	   Row r = ws.createRow(i);
	   Cell c= r.createCell(0);
	   
	   c.setCellValue(CountryNames.get(i).getText());
	   
	   String Name= CountryNames.get(i).getText();
	   System.out.println(Name);
	   
	   FileOutputStream file1 = new FileOutputStream("C:\\Users\\Avalon\\Desktop\\AnuTestData.xlsx");
	   wb.write(file1);
	  }
	 }
	 
	 @AfterTest
	 public void tearDown()
	 {
	  driver.close();
	 }
}
