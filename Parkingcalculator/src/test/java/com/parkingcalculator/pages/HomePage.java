package com.parkingcalculator.pages;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;


import com.parkingcalculator.library.Base;

public class HomePage extends Base {
	final static Logger logger = Logger.getLogger(HomePage.class);
	
	public HomePage goto_Parkingcal_Website() {

		driver.get("http://adam.goucher.ca/parkcalc/");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String Excepted = "Parking Calculator";
		assertEquals(pageTitle, Excepted);

		return this;
	}

	public void select_shortTermParking() {
		myLibrary.selectDropDown(By.id("Lot"), "Short-Term Parking");
		myLibrary.enterTextField(By.id("EntryTime"), "10:00");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/font/input[3]"));
		myLibrary.enterTextField(By.id("EntryDate"), "01/10/19");
		myLibrary.enterTextField(By.id("ExitTime"), "11:00");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/font/input[3]"));
		myLibrary.enterTextField(By.id("ExitDate"), "01/10/19");
		myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));
	}

	public void select_longTermParking() {
		myLibrary.selectDropDown(By.id("Lot"), "Long-Term Surface Parking");
		myLibrary.enterTextField(By.id("EntryDate"), "01/10/19");
		myLibrary.enterTextField(By.id("ExitDate"), "02/10/19");
		myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));
	}

	public void select_valetParking_irregularDuration() {
		try {

			myLibrary.selectDropDown(By.id("Lot"), "Valet Parking");
			myLibrary.enterTextField(By.id("EntryTime"), "8:15");
			myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/font/input[2]"));
			myLibrary.enterTextField(By.id("EntryDate"), "01/10/19");
			myLibrary.enterTextField(By.id("ExitTime"), "11:00");
			myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/font/input[3]"));
			myLibrary.enterTextField(By.id("ExitDate"), "01/14/19");
			myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));
			Thread.sleep(2 * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void select_longTermGarage_parking() {
		myLibrary.selectDropDown(By.id("Lot"), "Long-Term Garage Parking");
		myLibrary.enterTextField(By.id("EntryTime"), "5:00");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/font/input[3]"));
		myLibrary.enterTextField(By.id("EntryDate"), "01/10/19");
		myLibrary.enterTextField(By.id("ExitTime"), "3:00");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/font/input[3]"));
		myLibrary.enterTextField(By.id("ExitDate"), "02/12/19");
		myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));
	}

	public void select_economyParking() {
		myLibrary.selectDropDown(By.id("Lot"), "Economy Parking");
		myLibrary.enterTextField(By.id("EntryTime"), "1:00");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/font/input[2]"));
		myLibrary.enterTextField(By.id("EntryDate"), "01/10/19");
		myLibrary.enterTextField(By.id("ExitTime"), "11:30");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/font/input[3]"));
		myLibrary.enterTextField(By.id("ExitDate"), "01/10/19");
		myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));

	}

	public void select_parkingLeavingtimeBeforeTheEntryTime() {
		myLibrary.selectDropDown(By.id("Lot"), "Long-Term Surface Parking");
		myLibrary.enterTextField(By.id("EntryTime"), "1:00");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/font/input[2]"));
		myLibrary.enterTextField(By.id("EntryDate"), "01/10/19");
		myLibrary.enterTextField(By.id("ExitTime"), "8:00");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/font/input[3]"));
		myLibrary.enterTextField(By.id("ExitDate"), "01/9/19");
		myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));

	}
	public void select_valetParking_shortDuration() {
		myLibrary.selectDropDown(By.id("Lot"), "Valet Parking");
		myLibrary.enterTextField(By.id("EntryTime"), "8:00");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/font/input[2]"));
		myLibrary.enterTextField(By.id("EntryDate"), "01/10/19");
		myLibrary.enterTextField(By.id("ExitTime"), "9:30");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/font/input[2]"));
		myLibrary.enterTextField(By.id("ExitDate"), "01/10/19");
		myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));
		
	}
	public void select_nonexistentDate() {//this test is failed suppose to through error but its not
		myLibrary.selectDropDown(By.id("Lot"), "Short-Term Parking");
		myLibrary.enterTextField(By.id("EntryDate"), "13/32/19");
		myLibrary.enterTextField(By.id("ExitDate"), "14/32/19");
		myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));
	}
	
	public void select_februaryDays() {
		myLibrary.selectDropDown(By.id("Lot"), "Short-Term Parking");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/font/input[3]"));
		myLibrary.enterTextField(By.id("EntryDate"), "02/01/19");
		myLibrary.clickButton(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/font/input[3]"));
		myLibrary.enterTextField(By.id("ExitDate"), "03/01/19");
		myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));
	}

	public void select_exitdateBeforeEntryDate() {
	myLibrary.selectDropDown(By.id("Lot"), "Short-Term Parking");
	myLibrary.enterTextField(By.id("EntryDate"), "01/10/19");
	myLibrary.enterTextField(By.id("ExitDate"), "01/09/19");
	myLibrary.clickButton(By.xpath("/html/body/form/input[2]"));
}





}
