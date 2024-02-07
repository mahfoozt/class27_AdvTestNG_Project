package dataProvider;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

import base.Base;
import dataProvider.DataProvider_Test;

public class Read_Exc_DataProvider extends Base{
	public static Page page;
	@Test (dataProviderClass=DataProvider_Test.class,dataProvider= "ReadArray1")
	public  void test_readfromExcel(String cName, String fName, String lName) {
		System.out.println("This is the test where we read from Excel Sheet ");
        System.out.println("Apache POI is used to read an Excel file");
		System.out.println("Company Name: " + cName);
		System.out.println("First Name: "+ fName);
		System.out.println("Last Name: " +lName);
		
		
	//Again take the Screen Shot
	//Screen Shot
	//Thread.sleep(1000);
	//page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./target/Snap_Shot_Folder/Create_Lead.png")));
	//Thread.sleep(1000);
	// Input File
	// Used X-path
	//File Upload
	//page.setInputFiles("//input[@id='input__file']", Paths.get("./src/test/resources/files/rosylogo.png"));
	}
}
