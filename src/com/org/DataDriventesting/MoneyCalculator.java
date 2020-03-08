package com.org.DataDriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MoneyCalculator 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	try {
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\Mukhesh Kummithi\\\\Desktop\\\\Registration mercury travels.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet2");
		int rowcount=sheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			XSSFCell principalcell=row.getCell(0);
			int principal=(int)principalcell.getNumericCellValue();
			
			XSSFCell rateOfInterest=row.getCell(1);
			int roi=(int)rateOfInterest.getNumericCellValue();
			
			XSSFCell period=row.getCell(2);
			int per=(int)period.getNumericCellValue();
			
			XSSFCell frequency=row.getCell(3);
			String fre=frequency.getStringCellValue();
			
			XSSFCell maturity_value=row.getCell(4);
			int maturity=(int)maturity_value.getNumericCellValue();
			
			
			driver.findElement(By.xpath("//input[@name='principal']")).sendKeys(String.valueOf(principal));
			driver.findElement(By.xpath("//input[@name='interest']")).sendKeys(String.valueOf(roi));
			driver.findElement(By.xpath("//input[@name='tenure']")).sendKeys(String.valueOf(per));
			
			
			Select periodcombo=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			periodcombo.selectByVisibleText("year(s)");
			
			Select frequenc=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			frequenc.selectByVisibleText(fre);
			
			driver.findElement(By.xpath(".//*[@id='fdMatVal']/div[2]/a[1]/img")).click();
			
			WebElement actual_mvalue=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]"));
			
			if(Double.parseDouble(actual_mvalue)==)
			
			
			
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
