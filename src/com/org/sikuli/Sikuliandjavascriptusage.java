package com.org.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class Sikuliandjavascriptusage {
     @Test
	public void eclipseLaunch()
	{
	Screen s=new Screen();
	Pattern windowIcon=new Pattern("D:\\Study\\Sikuli Images\\windowlogo.JPG");
	Pattern cortana=new Pattern("D:\\Study\\Sikuli Images\\cortana.JPG");
	Pattern eclipseIcon=new Pattern("D:\\Study\\Sikuli Images\\EclipseLogo.jpg");
	
	try {
		s.click(windowIcon);
		s.type(cortana,"eclipseIcon");
		s.wait();
		s.click();
		s.find(cortana).left().find(target);
	} catch (InterruptedException | FindFailed e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
