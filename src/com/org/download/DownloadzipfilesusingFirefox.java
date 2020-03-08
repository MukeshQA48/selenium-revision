package com.org.download;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadzipfilesusingFirefox 
{
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "G://Selenium//Browser_Drivers//geckodriver.exe");
	//setting browser profile
	FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("browser.helperApps.neverAsk.SaveToDisk", "application/zip");//from www.sitepoint.com/mime-types-completelist
	profile.setPreference("browser.download.manager.showWhenstarting", false);
	FirefoxOptions opt=new FirefoxOptions();
	opt.setProfile(profile);
	WebDriver driver=new FirefoxDriver(opt);
	driver.get("http://testingmasters.com/student-corner/downloads/");
	driver.findElement(By.linkText("Download")).click();
}
}
