package com.org.SwitchingtoAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertwithOkbutton 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http:demo.automationtesting.in/Alerts.html");
	//click on alert with oklink
	driver.findElement(By.xpath("//a[@class='analystic']")).click();
	//click on okbutton
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	try {
		Thread.sleep(3000);
		//Switch to Alert Button
		System.out.println(driver.switchTo().alert().getText());
		//close the ok button
		driver.switchTo().alert().accept();//inorder to close the ok button
		//driver.close();
		driver.quit();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
}
}
