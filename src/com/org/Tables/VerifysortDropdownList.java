package com.org.Tables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifysortDropdownList 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Mukhesh%20Kummithi/eclipse-workspace/Seleniumrevison/Dropdownlist.html");
	driver.manage().window().maximize();
	WebElement element=driver.findElement(By.name("Icecream Flavours"));
	Select se =new Select(element);
	List originallist=new ArrayList();
	List<WebElement> options=se.getOptions();
	for(WebElement e:options)
	{
		originallist.add(e.getText());
	}
	System.out.println(originallist);
	List templist=new ArrayList();
	templist=originallist;
	System.out.println("Before sorted"+templist);
	Collections.sort(templist);
	System.out.println("after sorted"+originallist);
	if(originallist==templist)
	{
		System.out.println("Sorted successfully");
	}
	else
	{
		System.out.println("sorted failed");
	}
}
}
