package com.org.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VolunteerSignup 
{
/**
 * @param args
 */
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://fs18.formsite.com/1PO9XR/ehz5ing4m2/index.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Name,city,email,phone,DOB
	//Name
	driver.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys("tarak");
	//email
	driver.findElement(By.xpath("//input[@name='RESULT_TextField-3']")).sendKeys("tarak@gmail.com");
	//DOB
		/*
		 * driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		 * Select t=new
		 * Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")))
		 * ;
		 * 
		 * for(int i=4;i>=1;i++) {
		 * driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")
		 * ).click(); String
		 * nextmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		 * if(nextmonth.equals("December")); {
		 * driver.findElement(By.linkText("18")).click(); } } //past date for(int
		 * i=5;i>=1;i--) {
		 * driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")
		 * ).click(); String
		 * prevmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		 * if(prevmonth.equals("February")); {
		 * driver.findElement(By.linkText("18")).click(); } }
		 */
	//Radio button
	boolean check=driver.findElement(By.xpath("//*[@name='RESULT_RadioButton-10']")).isSelected();
	System.out.println(check);
	
	//Check box
     driver.findElement(By.xpath("/html/body/form/div[2]/div[21]/table/tbody/tr[1]/td/label")).click();
     driver.findElement(By.xpath("/html/body/form/div[2]/div[21]/table/tbody/tr[3]/td/label")).click();
	
	//dropdown/listbox/combo box
     Select s=new Select(driver.findElement(By.xpath("//select[@class='drop_down']")));
     s.selectByVisibleText("Amaravathi");
     
     //Bigger Text area
   driver.findElement(By.xpath("//textarea[@name='RESULT_TextArea-16']")).sendKeys("Mukhesh is a open hearted guy");
   
   driver.close();
   driver.quit();
}
}
