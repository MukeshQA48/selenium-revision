package com.org.download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadusingFirefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "G:\\Selenium\\Browser_Drivers\\geckodriver.exe");
		
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");//from www.sitepoint.com/mime-types-completelist
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		FirefoxOptions opt=new FirefoxOptions();
		WebDriver driver=new FirefoxDriver(opt);
		opt.setProfile(profile);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.linkText("File Download")).click();
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Welcome to the testing world");
		boolean generate=driver.findElement(By.xpath("//button[@class='btn btn-default']")).isEnabled();
		System.out.println(generate);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		if(generate==true)
		{
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		}
		driver.quit();

	}

}
