package com.onlinestore.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;

public class Authentication extends Base{
	ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
	
	final static Logger logger = Logger.getLogger(Authentication.class);
	public Authentication waitUntilPageLoad() {
		try {
		WebElement continueBTN = myLibrary.fluentWait(objmap.getLocator("ClickBTN"));
		Assert.assertNotNull(continueBTN, "waiting for page loading - failed");
		}catch(Exception e) {
			logger.error("Error: ", e);
		}
		return this;
	}
public Authentication createAnAccount(String emailaddress) {
	try {
	myLibrary.enterTextField(objmap.getLocator("Email_field"), emailaddress);
	myLibrary.clickButton(objmap.getLocator("ClickBTN"));
	}catch(Exception e) {
		logger.error("Error: ", e);
	}
	
	return this;
}


}
