package com.cucumber.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.driver.LaunchBrowsers;

import io.restassured.path.json.JsonPath;

public class CommonMethods {
	
    WebDriver driver;
	
	public CommonMethods() {
		
		//driver initialization
		this.driver = LaunchBrowsers.driver;
	}

	
	public void waitforvisibilityofelement(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		}
	
	//response to json path
	public static String parseJson(String json, String jPath) {
		
		JsonPath js = new JsonPath(json); //for parsing json
		String value = js.getString(jPath);
		return value;
		
	}
	
	
	

}
