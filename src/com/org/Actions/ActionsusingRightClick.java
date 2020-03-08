package com.org.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsusingRightClick 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://swisnl.github.io/");
	driver.findElement(By.linkText("jQuery-contextMenu")).click();
	driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/ul/li[2]/a")).click();
	Actions a=new Actions(driver);
	a.contextClick().build().perform();
	driver.findElement(By.xpath("/html/body/ul/li[3]")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.close();
}
}
