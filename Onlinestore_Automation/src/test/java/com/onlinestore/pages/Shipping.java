package com.onlinestore.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;

public class Shipping extends Base{
	ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
	final static Logger logger = Logger.getLogger(Shipping.class);
	public Shipping waitUntilPageLoad() {
		WebElement continueBTN = myLibrary.fluentWait(By.id("cgv"));
		Assert.assertNotNull(continueBTN, "waiting for page loading - failed");
		return this;
	}
public Shipping shippingInfo() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)", "");
	myLibrary.clickButton(By.id("cgv"));
	myLibrary.clickButton(By.cssSelector("#form > p > button > span"));
	
	
	return this;
}

}
