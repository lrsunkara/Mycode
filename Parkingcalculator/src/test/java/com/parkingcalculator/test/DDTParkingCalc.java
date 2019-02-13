package com.parkingcalculator.test;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.parkingcalculator.library.Base;
import com.parkingcalculator.library.ExcelManager;

public class DDTParkingCalc extends Base{
	final static Logger logger = Logger.getLogger(Base.class);
	private int counter =0;
	
	
	@BeforeMethod
	public void beforeTest() {
		try {
		driver.get("http://adam.goucher.ca/parkcalc/");
		String actual = driver.getTitle();
		System.out.println(actual);
		String Excepted = "Parking Calculator";
		assertEquals(actual, Excepted);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	
@DataProvider(name = "ParkingCalcData")
	
	private Object [][] calculatorData() {
	ExcelManager excelReader = new ExcelManager("src/test/resources/data/ParkingCalcDDT.xls");
	Object [][] data;
	data=excelReader.getExcelData("ParkingCalc");
	return data;
}
@Test (dataProvider = "ParkingCalcData")
public void dataDrivenTest(String lot,String eTime,String eDate,String lTime,String lDate){
	try {
		counter++;
		
	myLibrary.selectDropDown(By.id("Lot"), lot);
	myLibrary.enterTextField(By.id("EntryTime"), eTime);
	myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/font/input[3]"));
	myLibrary.enterTextField(By.id("EntryDate"), eDate);
	myLibrary.enterTextField(By.id("ExitTime"), lTime);
	myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/font/input[3]"));
	myLibrary.enterTextField(By.id("ExitDate"), lDate);
	myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));
	
	String EXtext = "[width='325']";
	String actual = driver.findElement(By.cssSelector(EXtext)).getText();
	System.out.println("Cost of parking: " + actual);
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
}
