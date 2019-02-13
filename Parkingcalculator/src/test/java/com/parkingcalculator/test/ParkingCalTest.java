package com.parkingcalculator.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.parkingcalculator.library.Base;
import com.parkingcalculator.pages.HomePage;

public class ParkingCalTest extends Base {
	final static Logger logger = Logger.getLogger(ParkingCalTest.class);
	HomePage myHomePage = new HomePage(); 

@Test
public void calculateParking() {
	myHomePage.goto_Parkingcal_Website();
	myHomePage.select_shortTermParking();
	myHomePage.select_longTermParking();
	myHomePage.select_valetParking_irregularDuration();
	myHomePage.select_longTermGarage_parking();
	myHomePage.select_economyParking();
	myHomePage.select_parkingLeavingtimeBeforeTheEntryTime();
	myHomePage.select_valetParking_shortDuration();
	myHomePage.select_nonexistentDate();
	myHomePage.select_februaryDays();
	myHomePage.select_exitdateBeforeEntryDate();

}




}
