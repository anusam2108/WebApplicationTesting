package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData_Excel 
{
 public static void main(String[] args) throws IOException
 {
  
  FileInputStream file = new FileInputStream("C:\\Users\\Avalon\\Desktop\\AnuTestData.xlsx");
  XSSFWorkbook wb = new XSSFWorkbook(file);
  XSSFSheet ws = wb.getSheet("Sheet1");
  
  Row r = ws.getRow(0);
  Cell c = r.getCell(0);
  
  String TestData = c.getStringCellValue();
  
  System.out.println(TestData);
  
  

 }

}