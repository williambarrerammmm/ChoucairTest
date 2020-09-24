package com.choucair.certification.newexperience.questions;

import java.util.List;

import com.choucair.certification.newexperience.userinterface.Cart;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheItems {
	
	public static Question<List<String>> displayed() {
        return Text.of(Cart.ITEMS)
                .describedAs("the items displayed")
                .asAList();
    }


}
