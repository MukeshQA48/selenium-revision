package com.org.SeleniumCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands 
{
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" , "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://newtours.demoaut.com");
	System.out.println(driver.getTitle());
	
	driver.navigate().to("https://www.facebook.com");
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	
	driver.navigate().refresh();
	System.out.println(driver.getTitle());
	}
}
