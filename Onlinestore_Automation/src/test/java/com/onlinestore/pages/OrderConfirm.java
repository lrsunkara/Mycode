package com.onlinestore.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;

public class OrderConfirm extends Base{
	ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
	final static Logger logger = Logger.getLogger(OrderConfirm.class);
	public OrderConfirm waitUntilPageLoad() {
		WebElement continueBTN = myLibrary.fluentWait(By.cssSelector("#center_column > p.alert.alert-success"));
		Assert.assertNotNull(continueBTN, "waiting for page loading - failed");
		return this;
	}	
	
	public OrderConfirm confarmation() {
		
		String a = "#center_column > p.alert.alert-success";
		//System.out.println("We are here");
		String abc = driver.findElement(By.cssSelector(a)).getText();
		System.out.println("Conformation number: " + abc);
		
		
		return this;
	}
	
	
	
	
public OrderConfirm confarmation_Tshirt() {
		
		String a = "#center_column > div";
		//System.out.println("We are here");
		String abc = driver.findElement(By.cssSelector(a)).getText();
		System.out.println("Conformation number: " + abc);
		
		
		return this;
	}
	
	
	
	
	
	
	
}
