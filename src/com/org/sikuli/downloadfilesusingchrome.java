package com.org.sikuli;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class downloadfilesusingchrome 
{
	public static boolean isFileExists(String path)
	{
		File f=new File(path);
		if(f.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
public static void main(String[] args) 
{
HashMap<String, Object> chromeprefs=new HashMap<String, Object>();
chromeprefs.put("profile.default_content_settings.popups", 0);
chromeprefs.put("download.prompt_for_download", false);
chromeprefs.put("download.default_directory", "G://Selenium//seleniumpractise");

ChromeOptions options=new ChromeOptions();
options.setExperimentalOption("prefs", chromeprefs);
DesiredCapabilities cap=DesiredCapabilities.chrome();
cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
cap.setCapability(options.CAPABILITY, options);
System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
WebDriver driver=new ChromeDriver(options);
driver.get("http://demo.automationtesting.in/");
driver.findElement(By.linkText("Skip Sign In")).click();
driver.findElement(By.linkText("More")).click();
driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/ul/li[3]/a")).click();
driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Welcome to the testing world");
driver.findElement(By.id("createTxt")).click();
driver.findElement(By.linkText("Download")).click();
if(isFileExists("G://Selenium//seleniumpractise"))
{
	System.out.println("file exists");
}
else
{
	System.out.println("file not exists");
}
}
}
