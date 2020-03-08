package com.org.SwitchingtoAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertwithokandcancel 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	//click on Alert with ok and cancel button
	driver.findElement(By.cssSelector("body > div.container.center > div > div > div > div.tabpane.pullleft > ul > li:nth-child(2) > a")).click();
	//click on ok and cancel link
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	//Switch to Alert first with ok button
	String expTextOK="You Pressed Ok";
	String expTextCancel="You Pressed Cancel";
	
	driver.switchTo().alert().accept();
	String actTextOk=driver.findElement(By.xpath("//*[@id='demo']")).getText();
	driver.switchTo().alert().dismiss();
	String actTextCancel=driver.findElement(By.cssSelector("#demo")).getText();
	if(expTextOK.equals(actTextOk))
	{
		System.out.println("test is passed");
	}
	if(expTextCancel.equals(actTextCancel))
	{
		System.out.println("test is failed");
	}
	
	
}
}
