package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin_base.in.Selenium_Base_class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition")

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = Selenium_Base_class.getDriver("chrome");

	}

//	@AfterClass
//	public static void close1() {
//		driver.close();
//	}

}
