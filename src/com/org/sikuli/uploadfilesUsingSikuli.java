package com.org.sikuli;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class uploadfilesUsingSikuli {

	public static void main(String[] args) throws InterruptedException 
	{	
		try {
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Browser_Drivers\\TestFolder\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
			String ImagesFilepath="G:\\Selenium\\seleniumpractise\\95839867-two-ripe-red-apple-fruits-with-green-leaf-isolated-on-white-background-red-apples-with-clipping-path .png";
			String inputFilepath="G:\\Selenium\\seleniumpractise\\95839867-two-ripe-red-apple-fruits-with-green-leaf-isolated-on-white-background-red-apples-with-clipping-path .png";
			
			Screen s=new Screen();
			Pattern fileinputtextbox=new Pattern(ImagesFilepath+"Textbox.PNG");
			Pattern openButton=new Pattern(ImagesFilepath+"open.PNG");
			Thread.sleep(5000);
			s.wait(fileinputtextbox,20);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
