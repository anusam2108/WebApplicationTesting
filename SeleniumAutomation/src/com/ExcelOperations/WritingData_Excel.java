package com.ExcelOperations;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WritingData_Excel {
	 public static void main(String[] args) throws IOException 
	 {
	  FileInputStream file = new FileInputStream("C:\\Users\\Avalon\\Desktop\\AnuTestData.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(file);
	  XSSFSheet ws = wb.getSheet("Sheet1");
	  
	  Row r = ws.createRow(1);
	  Cell c = r.createCell(2);
	  
	  c.setCellValue("Selenium123");
	  
	  FileOutputStream file1 =new FileOutputStream("C:\\Users\\Avalon\\Desktop\\AnuTestData.xlsx");
	  wb.write(file1);

}
}