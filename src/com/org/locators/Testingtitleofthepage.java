package com.org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingtitleofthepage 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("mukheshmuku9@gmail.com");
driver.findElement(By.id("pass")).sendKeys("11129B048");
driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
String act =driver.getTitle();
if(act.equals("https://www.facebook.com"))
{
	System.out.println("Login successfull");
}
else
{
	System.out.println("Login  unsuccessfull");
}
driver.close();
}
}
