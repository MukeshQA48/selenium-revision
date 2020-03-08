package com.org.AutoItScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlewithAutoit 
{
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
	driver.findElement(By.xpath("//input[@class='formInputText']")).sendKeys("Kareem");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Siddique");
	driver.findElement(By.xpath("//input[@class='photoFile']")).click();
	Runtime.getRuntime().exec("G:\\Selenium\\seleniumpractise\\95839867-two-ripe-red-apple-fruits-with-green-leaf-isolated-on-white-background-red-apples-with-clipping-path .png");
	driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	
} 
}
