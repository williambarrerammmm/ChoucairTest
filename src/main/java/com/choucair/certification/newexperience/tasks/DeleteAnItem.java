package com.choucair.certification.newexperience.tasks;

import com.choucair.certification.newexperience.actions.JSClick;
import com.choucair.certification.newexperience.userinterface.ClothesItem;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class DeleteAnItem {
	public static Performable called(String itemName) {
        return Task.where("{0} deletes the item " + itemName,
                JSClick.on(ClothesItem.DELETE_ITEM.of(itemName))
        );
    }

}
