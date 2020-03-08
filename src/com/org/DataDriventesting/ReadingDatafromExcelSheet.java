package com.org.DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDatafromExcelSheet 
{
public static void main(String[] args) {
	
	try {
		FileInputStream fis=new FileInputStream("C:\\Users\\Mukhesh Kummithi\\Desktop\\Registration.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentRow=sheet.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				String value=currentRow.getCell(j).toString();
				System.out.print("   "+value);
			}
			System.out.println();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
