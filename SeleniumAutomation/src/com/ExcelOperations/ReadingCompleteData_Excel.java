package com.ExcelOperations;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadingCompleteData_Excel {
	public static void main(String[] args) throws IOException 
	 {
	  FileInputStream file = new FileInputStream("C:\\Users\\Avalon\\Desktop\\AnuTestData.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(file);
	  XSSFSheet ws = wb.getSheet("Sheet2");
	  
	  // getLastRowNum() -- will identify the rows with the test data
	  int RowCount=ws.getLastRowNum();
	  
	  for(int i=0;i<=RowCount;i++) // Rows
	  {
	   Row r = ws.getRow(i);
	   
	   // getLastCellNum() -- will identify the Cell with test data
	   int CellCount= r.getLastCellNum();
	   
	   for(int j=0;j<CellCount;j++) // Cell
	   {
	    Cell c=r.getCell(j);
	    String TestData= c.getStringCellValue();
	    System.out.print(TestData+"  ");
	    
	   }
	   
	   System.out.println();
	   
}
	 }
}
