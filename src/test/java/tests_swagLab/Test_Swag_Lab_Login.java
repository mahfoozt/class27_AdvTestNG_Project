package tests_swagLab;

import org.testng.annotations.Test;

import base.Base;

public class Test_Swag_Lab_Login extends Base{
	@Test
	public static void test_Swag_Lab_Login() throws InterruptedException {	
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
		//continue shopping 
		Thread.sleep(1000);
		click("#continue-shopping");
		Thread.sleep(1000);
		click("(//div[@class='inventory_item_name '])[6]");
		Thread.sleep(1000);
		click(".shopping_cart_link");
		Thread.sleep(1000);
		click("#checkout");
		Thread.sleep(1000);
		fill("//input[@placeholder='First Name']", "rosy");
		Thread.sleep(1000);
		fill("//input[@placeholder='Last Name']", "sony");
		Thread.sleep(1000);
		fill("//input[@placeholder='Zip/Postal Code']","85283");
		Thread.sleep(1000);
		click("//input[@type='submit']");
		//click to finish
		click("//button[@id='finish']");
		Thread.sleep(1000);
		//verify finish page
		String welcomeMessage1 =innerText("//span[text()='Checkout: Complete!']");		
		System.out.println(welcomeMessage1);
		assertion("//span[text()='Checkout: Complete!']","Checkout: Complete!");
		Thread.sleep(2000);
		String welcomeMessage =innerText("//h2");		
		System.out.println(welcomeMessage );
		click("//button[@id='back-to-products']");
		p("Please don't forget to visit again");
			
		//click menu bar for log out 
		Thread.sleep(1000);
		click("//button[@id='react-burger-menu-btn']");
		Thread.sleep(1000);
		//click log out
		click("#logout_sidebar_link");
	 
		/*
		 * public class Saucedemo extends BaseData {

	public static void main(String[] args) {
		startUp();
		navigate("https://www.saucedemo.com/");
		fill("//input[@placeholder='Username']", "standard_user");
		fill("//input[@placeholder='Password']", "secret_sauce");
		click("//input[@type='submit']");
		Selection("//select[@class='product_sort_container']","za");
		click("//button[@id='add-to-cart-sauce-labs-onesie']");
	}
	public static void Selection(String path,String value) {
			page.selectOption(path,value);
		click("//div [text()='Sauce Labs Backpack']");
		// add to cart
		click("#add-to-cart-sauce-labs-backpack");
		// click remove
		click("#remove-sauce-labs-backpack");

		page.goBack();
		click("#add-to-cart-sauce-labs-fleece-jacket");
		click(".shopping_cart_link");
		click("#continue-shopping");
		click("(//div[@class='inventory_item_name '])[6]");
		click("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
		click(".shopping_cart_link");
		click("#checkout");
		//datatables.net arrowdown
		//click("//select[@name='example_length']");
		//we clicked in the menu bar
		click("#example_length > label > select");
		//before clicking we need to find the select the div- meaning the main area at the beginning of code
		arrowdown("div.dt-demo-selector__options");
		navigate("https://datatables.net");
		String Text = innerText("//div[@class='nav-item active']/a");
		System.out.println(Text);
		click("//a[@class='register-action follow-link login']");
		fill("//input[@id='DTE_Field_signin-username']", "Neepa");
		fill("//input[@id='DTE_Field_signin-password']", "2345678");
		click("//button[@class='btn']");
		count_Table_Head("//table", "//tr[1]/th");
		// click("//select[@name='example_length']");
		// we clicked in the menu bar
		click("#example_length > label > select");
		// before clicking we need to find the select the div- meaning the main area at
		// the beginning of code
		//arrow down("div.dt-demo-selector__options");
		 */
	}

}
