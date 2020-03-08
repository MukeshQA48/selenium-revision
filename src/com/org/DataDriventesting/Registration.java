package com.org.DataDriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	try {
		FileInputStream fis=new FileInputStream("C:\\Users\\Mukhesh Kummithi\\Desktop\\Registration mercury travels.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int noofRows=sheet.getLastRowNum();
		
		for(int row=1;row<noofRows;row++)
		{
			XSSFRow current_row=sheet.getRow(row);
			
			String FirstName=current_row.getCell(0).getStringCellValue();
			String LastName=current_row.getCell(1).getStringCellValue();
			String phone=current_row.getCell(2).toString();
			String Email=current_row.getCell(3).getStringCellValue();
			String Address=current_row.getCell(4).getStringCellValue();
			String City=current_row.getCell(5).getStringCellValue();
			String state=current_row.getCell(6).getStringCellValue();
			String postalcode=current_row.getCell(7).toString();
			String Country=current_row.getCell(8).getStringCellValue();
			String Username=current_row.getCell(9).getStringCellValue();
			String Password=current_row.getCell(10).getStringCellValue();
			String confirmPassword=current_row.getCell(11).getStringCellValue();
			
			driver.findElement(By.linkText("REGISTER")).click();
			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(FirstName);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(LastName);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
			driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(Email);
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(Address);
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(City);
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalcode);
			
			Select dropdown=new Select(driver.findElement(By.name("country")));
			dropdown.selectByVisibleText(Country);
			
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmPassword);
			
			
			driver.findElement(By.xpath("//input[@name='register']")).click();
			
			if(driver.getPageSource().contains("Thank you for registering"))
			{
				System.out.println("Registration completed for "+row+" record ");
			}
			else
			{
				System.out.println("Registration failed for "+row+" record ");
			}
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
}
}
