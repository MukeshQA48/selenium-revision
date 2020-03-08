package com.org.HandlingWindows;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com");
	
	try {
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement elements=links.get(i);
			String url=elements.getAttribute("href");
			URL link=new URL(url);
			
			HttpURLConnection connect=(HttpURLConnection) link.openConnection();
			connect.connect();
			int respcode=connect.getResponseCode();
			if(respcode>=400)
			{
				System.out.println(url+" -"+"is broken link");
			}
			else
			{
				System.out.println(url+"-"+"is valid link");
			}
			driver.quit();
		}
		
	} catch (InterruptedException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
