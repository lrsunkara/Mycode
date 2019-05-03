package com.onlinestore.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;

public class AddressConfirm extends Base {
	 ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
	final static Logger logger = Logger.getLogger(AddressConfirm.class);
	public AddressConfirm waitUntilPageLoad() {
		WebElement continueBTN = myLibrary.fluentWait(By.id("id_address_delivery"));
		Assert.assertNotNull(continueBTN, "waiting for page loading - failed");
		return this;
	}

public AddressConfirm confirmAddress() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)", "");
	myLibrary.clickButton(By.cssSelector("#center_column > form > p > button > span"));
	
	
	
	return this;
}





	//*[@id="columns"]/div[1]/a/i

}
