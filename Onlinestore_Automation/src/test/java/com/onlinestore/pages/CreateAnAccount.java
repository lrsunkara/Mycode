package com.onlinestore.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;

public class CreateAnAccount extends Base{
	final static Logger logger = Logger.getLogger(CreateAnAccount.class);
	ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
	public CreateAnAccount waitUntilPageLoad() {
		WebElement continueBTN = myLibrary.fluentWait(By.id("id_gender2"));
		Assert.assertNotNull(continueBTN, "waiting for page loading - failed");
		return this;
	}

public CreateAnAccount signIn() {
	try {
	WebElement gender = driver.findElement(By.id("id_gender2"));
	gender.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)", "");
	myLibrary.enterTextField(objmap.getLocator("CustomerFname_field"), "MeghuJay");
	myLibrary.enterTextField(objmap.getLocator("CustomerLname_field"), "Sunkara");
	myLibrary.enterTextField(objmap.getLocator("PWD_field"),"GBuTpVQH");
	myLibrary.selectDropDown(objmap.getLocator("DroDown1_field"), 16);
	myLibrary.selectDropDown("1",objmap.getLocator("DroDown2_field"));;
	myLibrary.selectDropDown("1978",objmap.getLocator("DroDown3_field"));
	Thread.sleep(1000);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,800)", "");
	myLibrary.enterTextField(objmap.getLocator("Address_field"), "21265 HyrstGrove Terr");
	myLibrary.enterTextField(objmap.getLocator("City_field"), "20147");
	myLibrary.selectDropDown("46", objmap.getLocator("State_field"));
	myLibrary.enterTextField(objmap.getLocator("PostalCode_field"), "20147");
	myLibrary.selectDropDown("21",objmap.getLocator("Country_field"));
	myLibrary.enterTextField(objmap.getLocator("Mobile_field"), "1234567890");
	myLibrary.enterTextField(objmap.getLocator("AliasAddress_field"), "My address");
	myLibrary.clickButton(objmap.getLocator("ClickBTN_field"));//Registration is done move on to next page
	}catch(Exception e) {
	logger.error("Error: ", e);	
}
	
	return this;
}







}
