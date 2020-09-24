package com.choucair.certification.newexperience.actions;

import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class JSClick implements Interaction {

	
	private final Target target;

    public JSClick(Target target) {
        this.target = target;
    }

    @Step("{0} clicks on #target")
    public <T extends Actor> void performAs(T theActor) {
        WebElement targetElement = target.resolveFor(theActor);
        BrowseTheWeb.as(theActor).evaluateJavascript("arguments[0].click()", targetElement);
    }

    public static Interaction on(Target target) {
        return instrumented(JSClick.class, target);
    }
    
}
