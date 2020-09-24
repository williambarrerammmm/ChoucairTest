package com.choucair.certification.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class App {
	
	public final static Target MAIN_HEADING = Target.the("main heading").locatedBy("//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div[3]");
    public final static Target FOOTER       = Target.the("footer").locatedBy(".//div[@class='footer-container']");

}
