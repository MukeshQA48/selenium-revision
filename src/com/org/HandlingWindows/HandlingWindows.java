package com.org.HandlingWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("btn2")).click();
	driver.findElement(By.linkText("WebTable")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Home")).click();
	Set<String> s=driver.getWindowHandles();
	
	for(String i:s)
	{
		System.out.println(i);
		String t=driver.switchTo().window(i).getTitle();
		System.out.println(t);
		/*if(t.contains("Index"))
		{
			driver.close();
		}*/
		if(t.contains("Web Table"))
		{
			driver.close();
		}
	}
	
	
}
}
