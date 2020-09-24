package com.choucair.certification.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ClothesItem {
	 public static Target ITEM_LABEL    =  Target.the("the clothe Blouse")
	            .locatedBy("//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']//div[@class='product-image-container']");

	    public static final Target
	            SELECT_ITEM = Target.the("the select item tick")
	            .locatedBy("//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//span[contains(text(),'Add to cart')]");

	    public static final Target DELETE_ITEM   = Target.the("the delete item button")
	            .locatedBy("//a[@id='2_7_0_0']//i[@class='icon-trash']");
}
