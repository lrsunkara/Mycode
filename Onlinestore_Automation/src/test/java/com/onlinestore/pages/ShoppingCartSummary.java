package com.onlinestore.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;

public class ShoppingCartSummary extends Base {
	final static Logger logger = Logger.getLogger(ShoppingCartSummary.class);
	ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
	public ShoppingCartSummary waitUntilPageLoad() {
		try {
		WebElement continueBTN = myLibrary.fluentWait(objmap.getLocator("ProccedToCheck_field"));
		Assert.assertNotNull(continueBTN, "waiting for page loading - failed");
		}catch(Exception e) {
			logger.error("Error: ", e);	
		}
		return this;
	}

	public ShoppingCartSummary proceedToCheckOutBTN() {
		try {
		myLibrary.clickButton(By.cssSelector("#center_column p:nth-child(7) span"));
			//myLibrary.clickButton(objmap.getLocator("ProccedToCheck_field"));element not interactable with objmap
		}catch(Exception e) {
			logger.error("Error: ", e);	
		}
		
		return this;
	}

}
//#center_column p:nth-child(8) span
