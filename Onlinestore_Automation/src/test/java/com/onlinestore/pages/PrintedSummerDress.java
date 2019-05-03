package com.onlinestore.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.onlinestore.library.Base;
import com.onlinestore.objectmapproject.ObjectMap;

public class PrintedSummerDress extends Base{
	final static Logger logger = Logger.getLogger(PrintedSummerDress.class);
	ObjectMap objmap = new  ObjectMap("src/test/resources/ObjectPropertiesFile/objectmap.properties");
	public PrintedSummerDress waitUntilPageLoad() {
		
		WebElement continueBTN=myLibrary.fluentWait(By.id("quantity_wanted"));
		Assert.assertNotNull(continueBTN, "waiting for page loading - failed");
		
		return this;
	}
	
	public PrintedSummerDress dressQuantity() {
		try {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)", "");
			//myLibrary.scrollByOffsetVertical("400");this method is not working// 
		Thread.sleep(1*1000);
		myLibrary.enterTextField(objmap.getLocator("Quantity_field"),"4");
		myLibrary.clickButton(objmap.getLocator("ClickOnMinus_field"));
		Thread.sleep(500);
		myLibrary.clickButton(objmap.getLocator("ClickOnMinus_field"));
		Thread.sleep(500);
		myLibrary.clickButton(objmap.getLocator("ClickOnMinus_field"));
		Thread.sleep(500);
		myLibrary.clickButton(objmap.getLocator("ClickOnMinus_field"));
		Thread.sleep(500);
		myLibrary.selectDropDown(objmap.getLocator("SelectSize_field"), 0);
		Thread.sleep(300);
		myLibrary.clickButton(objmap.getLocator("DressesColourY_field"));
		Thread.sleep(300);
		myLibrary.clickButton(objmap.getLocator("DressesColourB_field"));
		Thread.sleep(300);
		myLibrary.clickButton(objmap.getLocator("DressesColourO_field"));
		Thread.sleep(300);
		myLibrary.clickButton(objmap.getLocator("ClickBTN1_field"));
		Thread.sleep(300);
		myLibrary.clickButton(objmap.getLocator("ClickBTN2_field"));
		Thread.sleep(300);
		myLibrary.clickButton(objmap.getLocator("ClickBTN3_field"));
		Thread.sleep(300);
		myLibrary.clickButton(objmap.getLocator("ClickBTN4_field"));
	
		}catch(Exception e) {
			logger.error("Error: ", e);	
		}
		return this;
	}
	
	public PrintedSummerDress dressQuantity_tShirt() {
		try {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200)", "");
			//myLibrary.scrollByOffsetVertical("400");this method is not working// 
		Thread.sleep(1*1000);
		myLibrary.enterTextField(objmap.getLocator("Quantity_field"),"4");
		myLibrary.clickButton(objmap.getLocator("ClickOnMinus_field"));
		Thread.sleep(500);
		myLibrary.clickButton(objmap.getLocator("ClickOnMinus_field"));
		Thread.sleep(500);
		myLibrary.clickButton(objmap.getLocator("ClickOnMinus_field"));
		Thread.sleep(500);
		
		myLibrary.selectDropDown(By.id("group_1"), 1);
		for (int index=1;index<=2; index++)
		{
		WebElement tshirtColour = driver.findElement(By.id("thumb_" + index));
		Actions action = new Actions(driver);
		action.moveToElement(tshirtColour).build().perform();
		Thread.sleep(1000);}
		myLibrary.clickButton(By.cssSelector("[name='Orange']"));
		Thread.sleep(300);
		myLibrary.clickButton(By.cssSelector("#color_to_pick_list li:nth-of-type(2) .color_pick"));
		Thread.sleep(300);
		myLibrary.clickButton(By.cssSelector("#add_to_cart > button > span"));
		myLibrary.clickButton(By.cssSelector("[title='Proceed to checkout'] span"));
		
		}catch(Exception e) {
			logger.error("Error: ", e);	
		}
		return this;
	}
	
	
}
