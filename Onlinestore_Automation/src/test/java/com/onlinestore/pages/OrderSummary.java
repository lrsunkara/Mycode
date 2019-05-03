package com.onlinestore.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;

public class OrderSummary extends Base{
	ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
	final static Logger logger = Logger.getLogger(OrderSummary.class);
	public OrderSummary waitUntilPageLoad() {
		WebElement continueBTN = myLibrary.fluentWait(By.cssSelector("#cart_navigation > button > span"));
		Assert.assertNotNull(continueBTN, "waiting for page loading - failed");
		return this;
	}	
	public OrderSummary confirmOrder() {
		myLibrary.clickButton(By.cssSelector("#cart_navigation > button > span"));
		
		
		return this;
	}
	
	
	
}
