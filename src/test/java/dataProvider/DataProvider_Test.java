package dataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel1;

public class DataProvider_Test {
/*	//public String excelfile;
	@Test (dataProvider = "loginCredential")
	public void test_loginFunctions1(String id, String password) {
		System.out.println("loginId: " + id);
		System.out.println("login password: "+ password);
		System.out.println("Login Success");		
	}
	@DataProvider 
	public Object[][] loginCredential(){
		Object [][] loginData = new Object[3][2];	
		loginData[0][0] ="id1";
		loginData[0][1] ="password1";
		loginData[1][0] ="id2";
		loginData[1][1] ="password2";
		loginData[2][0] ="id3";
		loginData[2][1] ="password3";
		return loginData;		
	}
	@Test (dataProvider = "getData1")
	public void test_loginFunctions3(String cName, String fName, String lName) {
		System.out.println("This is the test where we read from Excel Sheet ");
        System.out.println("Apache POI is used to read an Excel file");
		System.out.println("Company Name: " + cName);
		System.out.println("First Name: "+ fName);
		System.out.println("Last Name: " +lName);
	}
//	@DataProvider (name="ReadExc")
//	public String getData() throws IOException{
//		ReadExcel1 r1 = new ReadExcel1();
//		return (String) r1.readExcel(excelfile);
//	}
	*/
	/*8@DataProvider (name="ReadArray")
	public Object[][] getData1() {
		Object [][] data = new Object[3][3];
	data [0][0] = "ABC";
	data [0][1] = "Mahfooz";
	data [0][2] = "Murshalin";
			
	data [1][0] = "BCD";
	data [1][1] = "Sazia";
	data [1][2] = "Islam";
	
	data [2][0] = "DEF";
	data [2][1] = "Neepa";
	data [2][2] = "Khan";	
	return data;	//add return type 			
	}*/
	@DataProvider(name="ReadArray1") 
	public void Read_Excel_File1() {
        try {
            // Provide the path to your Excel file
            String excelFilePath = ".\\Data\\ReadData.xlsx";
            // Open the Excel file
            FileInputStream inputStream = new FileInputStream(excelFilePath);
            Workbook wb = new XSSFWorkbook(inputStream); 
           // Assuming your data is in the first sheet (index 0)
            XSSFSheet sheet = (XSSFSheet) wb.getSheetAt(0);
            // Iterate through rows and columns to print cell values
            for (Row row : sheet) {
                for (Cell cell : row) {	//toString() Returns a string representation of the object.
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println(); // Move to the next line after each row
            }		
            // Close the workbook and input stream
            wb.close();
            inputStream.close();
        }       
			catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}
