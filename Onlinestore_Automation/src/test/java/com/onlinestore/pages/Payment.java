package com.onlinestore.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;

public class Payment extends Base {
	final static Logger logger = Logger.getLogger(Payment.class);
	ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
	public Payment waitUntilPageLoad() {
		WebElement continueBTN = myLibrary.fluentWait(By.partialLinkText("Pay by check"));
		Assert.assertNotNull(continueBTN, "waiting for page loading - failed");
		return this;
	}
	public Payment paymentTypeCheck() {
	myLibrary.clickButton(By.partialLinkText("Pay by check"));	
		
		
		return this;
	}
	public Payment paymentTypeWire() {
		myLibrary.clickButton(By.partialLinkText("Pay by bank wire"));	
			
			
			return this;
		}
	
	
}
