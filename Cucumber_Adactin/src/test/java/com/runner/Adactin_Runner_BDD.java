package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Utility_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
	(
		features = "./Feature",
		glue = "com.step_definition",
		monochrome = true,
		plugin = { "pretty" },
		publish = true
		
	)

public class Adactin_Runner_BDD {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() {
		driver = Utility_Files.get_Browser("chrome");
	}
	
	@AfterClass
	public static void tear_Down() {
		driver.close();
	}
	
	

}
