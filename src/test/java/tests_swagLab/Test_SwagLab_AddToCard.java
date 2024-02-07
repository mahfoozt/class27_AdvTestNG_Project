package tests_swagLab;

import org.testng.annotations.Test;

import base.Base;

public class Test_SwagLab_AddToCard extends Base{
	@Test
	public static void test_AddToCard() throws InterruptedException {	
		navigate("https://www.saucedemo.com/");
		//enter user name	
		fill("//input[@placeholder='Username']", "standard_user");
		//enter password
		fill("//input[@placeholder='Password']", "secret_sauce");
		//click Login button
		click("//input[@type='submit']");
		//verify login page
		assertion("//div[text()='Swag Labs']","Swag Labs");	
		Thread.sleep(1000);
		Selection("//select[@class='product_sort_container']","za");
		Thread.sleep(1000);
		// add to cart
		click("//button[@id='add-to-cart-sauce-labs-onesie']");
		Thread.sleep(1000);
		// add to cart
		click("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
		//remove item
		click("//button[@id='remove-sauce-labs-onesie']");
		Thread.sleep(1000);
		// add to cart 
		click("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
		Thread.sleep(1000);		
		click(".shopping_cart_link");
		
	}

}
