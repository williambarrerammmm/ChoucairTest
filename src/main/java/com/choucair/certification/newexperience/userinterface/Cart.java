package com.choucair.certification.newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class Cart {
	
	public static final Target WHAT_NEEDS_TO_BUY = Target.the("'What needs to buy?' field").locatedBy("//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//span[contains(text(),'Add to cart')]");
    public static final Target ITEMS = Target.the("List of items in the cart").locatedBy("//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@class='col-sm-4 clearfix']/div[@class='shopping_cart']/a[1]");
    public static final Target CLEAR_SELECTED = Target.the("Clear selected").locatedBy("//tr[@id='product_2_7_0_0']//td[@class='cart_delete text-center']//div");
    public static final Target FILTER = Target.the("filter by {0}").locatedBy("//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]");
    public static final Target COMPARE = Target.the("compare").locatedBy("//div[@class='top-pagination-content clearfix']//form[@class='compare-form']");

}
