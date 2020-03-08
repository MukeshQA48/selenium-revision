package com.org.HeadlessBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessFirefox 
{
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "G://Selenium//Browser_Drivers//geckodriver.exe");
	FirefoxOptions options=new FirefoxOptions();
	//options.addArguments("--headless");
	options.setHeadless(true);
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demo.nopcommerce.com");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
}
}
