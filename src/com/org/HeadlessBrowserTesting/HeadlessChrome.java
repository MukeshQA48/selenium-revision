package com.org.HeadlessBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\\\Selenium\\\\Browser_Drivers\\\\TestFolder\\\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	//options.addArguments("--headless");
	options.setHeadless(true);
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
}
}
