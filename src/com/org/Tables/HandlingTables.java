package com.org.Tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingTables 
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	
	WebElement admin=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
	WebElement usermg=driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']"));
	WebElement users=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
	Actions a=new Actions(driver);
	/*a.moveToElement(admin).build().perform();
	a.moveToElement(usermg).build().perform();
	a.moveToElement(users).click().build();*/
	a.moveToElement(admin).moveToElement(usermg).moveToElement(users).click().build().perform();;
	
	/*driver.findElement(By.id("menu_admin_UserManagement")).click();
	int noOfRows=driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr/td")).size();
	System.out.println(noOfRows);
    int statuscount=0;
    for(int i=1;i<=noOfRows;i++)
    {
    	String status=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[5]")).getText();
    	if(status.equals("Enabled"))
    	{
    		statuscount=statuscount+1;
    	}
    }
    	System.out.println("no of Employees Enabled"+statuscount);*/
    	driver.close();
    
    
	}
	
	
	
}