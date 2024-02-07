package tests_swagLab;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePageVerification extends Base {
	@Test
	public static void homePageVerification() throws InterruptedException {
				//go to URL
				navigate("https://www.saucedemo.com/");
				//get title page
				System.out.println( page.title() );
				//verify title page
				assertion("//div[text()='Swag Labs']","Swag Labs");
				Thread.sleep(1000);
				assertThat(page).hasTitle("Swag Labs");
				p("Saucedemo Home Page Verification Done");
			
			}
}
