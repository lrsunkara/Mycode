package com.onlinestore.pages;


import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;

import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;


public class HomePage extends Base {
	final static Logger logger = Logger.getLogger(HomePage.class);
	ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
	public HomePage gotoMyStorewebsite() {
		try {
		driver.get("http://automationpractice.com/index.php");
		String actual = driver.getTitle();
		String expected = "My Store";
		assertEquals(actual, expected);	
		} catch (Exception e) {
			logger.error("Error: ", e);
		}
		return this;
		}
	public HomePage selectingCasualdress() {
		try {
		myLibrary.enterTextField(objmap.getLocator("SearchCasualD_field"),"Casual dress");
		myLibrary.clickButton(objmap.getLocator("SearchBTN_field"));
		} catch(Exception e) {
			logger.error("Error: ", e);
		}
		return this;
	}
	
	public HomePage selectingT_shirts() {
	try {
		myLibrary.enterTextField(objmap.getLocator("SearchCasualD_field"), "T-SHIRTS");
		myLibrary.clickButton(objmap.getLocator("SearchBTN_field"));
		
	} catch(Exception e) {
		logger.error("Error: ", e);
	}
		return this;
	}
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	


	




}
