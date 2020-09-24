package com.choucair.certification.newexperience.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucair.certification.newexperience.userinterface.Cart.WHAT_NEEDS_TO_BUY;
import static org.openqa.selenium.Keys.RETURN;

public class AddAItem {
	
	public static Task called(String thingToDo) {
        return Task.where("{0} adds a todo item called: #thingToDo",
                Enter.theValue(thingToDo)
                        .into(WHAT_NEEDS_TO_BUY)
                        .thenHit(RETURN)
                ).with("thingToDo").of(thingToDo);
    }

}
