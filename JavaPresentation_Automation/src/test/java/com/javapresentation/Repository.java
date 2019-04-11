package com.javapresentation;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class Repository {
	final static Logger logger = Logger.getLogger(Repository.class);
	private WebDriver driver;
	
	public Repository(WebDriver _driver) {
		driver = _driver;
		
		
	}
	
	public WebDriver startChromeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/browers_drivers/chromedriver.exe");
			// start a browser
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		} catch (Exception e) {
			logger.error("Error: ", e);
			assertTrue(false);
		}
		return driver;

	}
	
	private WebDriver startIEBrowser() {
		try {
			System.setProperty("webdriver.ie.driver", "src/test/resources/browers_drivers/IEDriverServer.exe");
			// start a IE browser
			// Ignoring security protected mode using below code

			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability("ignoreProectedModesetting", true);
			capabilities.setCapability("ie.ensureCleanSession", true);
			driver = new InternetExplorerDriver(capabilities);
			// This is setting zoom to 100% by code
			// WebElement body = driver.findElements(By.tagName("body"));

			logger.info("InternetExplorer browser is starting ...");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		} catch (Exception e) {

			logger.error("Error: ", e);
			assertTrue(false);
		}
		return driver;

	}
	public void selectDropDown(By by, String visibleTextValue) {
		try {
			WebElement dropDownElement = driver.findElement(by);
			Select dropDown = new Select(dropDownElement);
			dropDown.selectByVisibleText(visibleTextValue);

		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
	

	public void selectDropDown(By by, int index) {
		try {
			WebElement dropDownElement = driver.findElement(by);
			Select dropDown = new Select(dropDownElement);
			dropDown.selectByIndex(index);

		} catch (Exception e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
	
	
	
	
	
}
