package com.cucumber.stepdefinitions;

import com.cucumber.driver.LaunchBrowsers;
import com.cucumber.testpages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LaunchBrowsers {
	
	LoginPage lp = new LoginPage();
	
	@Given("user launches saucedemo website")
	public void user_launches_saucedemo_website() {
	   lp.launchURL("https://www.saucedemo.com/");
	   //driver.get("https://www.saucedemo.com/");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
	   lp.enterUsername("standard_user");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user closes the browser")
	public void user_closes_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
