package com.cucumber.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowsers {
	
	public static WebDriver driver;
	
	public static void launchChromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless=new");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
	}

}
