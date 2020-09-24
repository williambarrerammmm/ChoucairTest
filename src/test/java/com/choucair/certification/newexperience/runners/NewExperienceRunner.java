package com.choucair.certification.newexperience.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/login.feature",
		glue = "com.choucair.certification.newexperience.stepdefinitions"
		)

public class NewExperienceRunner {
	
}
