package com.cucumber.testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.base.CommonMethods;
import com.cucumber.driver.LaunchBrowsers;

public class LoginPage extends CommonMethods {
	
	WebDriver driver;
	
	public LoginPage() {
		
		//driver initialization
		this.driver = LaunchBrowsers.driver;
		PageFactory.initElements(driver, this);		
	}
	
	//WebElement username = driver.findElement(By.id("user-name"));
	
	//Page Factory
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	
	public void launchURL(String url) { 
		driver.get(url);
	}
	
	public void enterUsername(String user) {
		waitforvisibilityofelement(username);
		username.sendKeys(user);
	}

}
