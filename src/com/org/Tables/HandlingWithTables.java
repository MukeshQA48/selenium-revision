package com.org.Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWithTables 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/Mukhesh%20Kummithi/eclipse-workspace/Seleniumrevison/Table.html");
	int noOfRows=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
	System.out.println(noOfRows);
	
	int noOfCols=driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
	System.out.println(noOfCols);
	
	for(int i=2;i<=noOfRows;i++)
	{
		for(int j=1;j<=noOfCols;j++)
		{
			System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"    ");
		}
		System.out.println();
	}
	driver.close();

	
}
}
