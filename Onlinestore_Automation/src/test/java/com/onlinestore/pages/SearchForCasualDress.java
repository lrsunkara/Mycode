package com.onlinestore.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;

public class SearchForCasualDress extends Base{
	final static Logger logger = Logger.getLogger(SearchForCasualDress.class);
	ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
public SearchForCasualDress waitUntilPageLoad() {
		
		WebElement continueBTN=myLibrary.fluentWait(By.id("selectProductSort"));
		Assert.assertNotNull(continueBTN, "waiting for page loading - failed");
		
		return this;
	}
	
	public SearchForCasualDress selectCausalDress() {
		try {
			myLibrary.selectDropDown(objmap.getLocator("PriceDropDown_field"), 2);
			//myLibrary.selectDropDown(By.id("selectProductSort"), 2);
		
		Thread.sleep(1*1000);
		
WebElement moreBtn1 = driver.findElement(By.cssSelector("[class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line'] [title='View'] span"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", moreBtn1);
		
		
		}catch(Exception e) {
			logger.error("Error: ", e);	
		}
		return this;
	}
	
	public SearchForCasualDress selectT_shirt() {
		try {
			myLibrary.selectDropDown(objmap.getLocator("PriceDropDown_field"), 2);
			
		//myLibrary.selectDropDown(By.id("selectProductSort"), 2);
		WebElement moreBtn2 = driver.findElement(By.cssSelector("[title='View'] span"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", moreBtn2);
	}catch(Exception e) {
		logger.error("Error: ", e);	
	}
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
}
