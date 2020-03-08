package com.org.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsUsingDragandDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/dg-crop/dg-crop.html");
		WebElement source=driver.findElement(By.xpath("//div[@class='dg-movable']"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"cropImage\"]/div[1]/div[1]"));
		Actions act=new Actions(driver);
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
        act.dragAndDrop(source, target);
	}

}
