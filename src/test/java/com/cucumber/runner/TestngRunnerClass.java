package com.cucumber.runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions
(
		features = "FeatureFolder", //feature
		glue={"com/cucumber/stepdefination"}//step files
//		tags={"@only"},
//		format = {"pretty","html:target/HTMLCucumberReport","json:target/Cucumber.json"}

		)
public class TestngRunnerClass extends AbstractTestNGCucumberTests 
{
	@Test
	public void f()

	{


	}
}
