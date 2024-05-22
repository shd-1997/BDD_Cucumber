package com.cucumber.testrunner;

import org.testng.annotations.BeforeTest;

import com.cucumber.driver.LaunchBrowsers;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@test1", features={"src/test/resources/Features"}, glue={"com/cucumber/stepdefinitions"}, 
                 plugin={"pretty","html:target/htmlreport.html"})


public class RunCucumberTest extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public static void runDriver() {
		LaunchBrowsers.launchChromeBrowser();
	}
	
	

}
