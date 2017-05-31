package com.cucumber.stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^I have Tracko Url$")
	public void i_have_Tracko_Url() throws Throwable {
	    System.out.println("Given");
	  
	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		System.out.println("When");
	  
	}

	@Then("^I should login$")
	public void i_should_login() throws Throwable {

		System.out.println("Then");
	 
	}
	
	
	@When("^I will enter (.*), (\\d+), (\\w+) and (.*)$")
	public void anything(String phnumber, int zip, String name, String pass)
	{
		
		System.out.println("Once again When");
		System.out.println(phnumber);
		System.out.println(zip);
		System.out.println(name+" "+ pass);
	
		
	}
	
	@Then("^I shoudld create an account$")
	public void i_shoudld_create_an_account() throws Throwable {

		System.out.println("Test");
	}
}
