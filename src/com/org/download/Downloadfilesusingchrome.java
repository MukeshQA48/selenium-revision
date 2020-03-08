package com.org.download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfilesusingchrome 
{
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	//driver.findElement(By.xpath("//button[@class='btn btn-primary-outline']")).click();
	driver.findElement(By.linkText("More")).click();
	driver.findElement(By.linkText("File Download")).click();
	driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Welcome to the testing world");
	boolean generate=driver.findElement(By.xpath("//button[@class='btn btn-default']")).isEnabled();
	System.out.println(generate);
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	if(generate==true)
	{
	driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
	}
	driver.findElement(By.id("pdfbox")).sendKeys("Welcome to the testing world");
	boolean generate1=driver.findElement(By.xpath("//button[@id='createPdf']")).isEnabled();
	System.out.println(generate1);
	if(generate==true)
	{
		driver.findElement(By.linkText("Download")).click();
	}
	driver.quit();
	}
}
