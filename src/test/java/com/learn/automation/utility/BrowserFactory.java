package com.learn.automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static void  startApplication(WebDriver driver, String browser , String url) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\anitt\\OneDrive\\Documents\\Selenium-java\\"
					+ "newseleinum start\\chromedriver_win32 (10).chromedriver.exe");
			driver= new ChromeDriver();
		
	}
		
		else if(browser.)

}
	}