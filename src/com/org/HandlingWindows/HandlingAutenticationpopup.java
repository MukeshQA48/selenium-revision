package com.org.HandlingWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutenticationpopup 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
	//including username and password to the url
	//http://admin:admin@url-->Syntax 
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	String text=driver.findElement(By.cssSelector("p")).getText();
	System.out.println(text);
	driver.close();
}
}
