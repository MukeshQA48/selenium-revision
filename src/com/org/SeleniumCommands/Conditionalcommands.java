package com.org.SeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalcommands 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" , "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	if(email.isDisplayed()&&email.isEnabled())
	{
		email.sendKeys("mukheshmuku9@gmail.com");
	}
	if(pass.isDisplayed()&&pass.isEnabled())
	{
		pass.sendKeys("11129B048");
	}
	System.out.println(driver.findElement(By.xpath("//input[@id='u_0_8']")).isSelected());
	System.out.println(driver.findElement(By.xpath("//input[@id='u_0_9']")).isSelected());
	
	driver.close();
}
}
