package com.choucair.certification.newexperience.tasks;

import com.choucair.certification.newexperience.models.CartStatusFilter;
import com.choucair.certification.newexperience.userinterface.Cart;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class FilterItems {
	
	public static Performable toShow(CartStatusFilter filter) {
        return Task.where("{0} filters items by " + filter,
                Click.on(Cart.FILTER.of(filter.name()))
        );
    }

}
