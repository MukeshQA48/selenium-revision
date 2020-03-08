package com.org.SeleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.name("userName")).sendKeys("Mukesh48");
	driver.findElement(By.name("password")).sendKeys("Mukesh@48");;
	
	driver.findElement(By.xpath("//input[@name='login']")).click();
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	//driver.findElement(By.xpath("//td[@class='mouseOut']")).click();
	if(title.contains("http://newtours.demoaut.com/mercuryreservation.php"))
	{
		System.out.println("Login successfull");
	}
	else
	{
		System.out.println("login unsuccessfull");
	}
	driver.close();
}
}
