package com.choucair.certification.newexperience.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Start {
	
	public static Performable openPage() {
		Open.browserOn();
		return Task.where("{0} Open the New Experience Web Page",
			Open.url("http://automationpractice.com/index.php")
		);
	}
	

}
