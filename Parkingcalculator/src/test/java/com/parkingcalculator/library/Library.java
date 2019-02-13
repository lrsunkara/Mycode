package com.parkingcalculator.library;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;


public class Library {
	final static Logger logger = Logger.getLogger(Library.class);
	private WebDriver driver;
	private boolean isDemo = false;

	public Library(WebDriver _driver) {
		driver = _driver;

	}
	/***
	 * This method launch the browser, wait for 30sec and maximize the window
	 * 
	 * @return webDriver
	 */
	public WebDriver startChromeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/browers_drivers/chromedriver.exe");
			// start a browser
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return driver;

	}

	public void setDemo(boolean isDemo) {
		this.isDemo = isDemo;
	}

	public boolean getDemo() {
		return isDemo;
	}

	/***
	 * This is the method enters text string to a edit webElement in web-site
	 * 
	 * @param by
	 * @param value
	 */
	public void enterTextField(By by, String value) {
		try {
			WebElement textWebElement = driver.findElement(by);
			textWebElement.clear();
			textWebElement.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/***
	 * This method is use to select the drop down webElement by selecting the
	 * visible text in web-site
	 * 
	 * @param by
	 * @param visibleTextValue
	 */
	public void selectDropDown(By by, String visibleTextValue) {
		try {
			WebElement dropDownElement = driver.findElement(by);
			Select dropDown = new Select(dropDownElement);
			dropDown.selectByVisibleText(visibleTextValue);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***
	 * This method is use to select the drop down webElement by selecting the index
	 * in web-site
	 * 
	 * @param by
	 * @param index
	 */

	public void selectDropDown(By by, int index) {
		try {
			WebElement dropDownElement = driver.findElement(by);
			Select dropDown = new Select(dropDownElement);
			dropDown.selectByIndex(index);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***
	 * This method is use to select the drop down by selecting the webElement by
	 * value in web-site
	 * 
	 * @param attributeValue
	 * @param by
	 */
	public void selectDropDown(String attributeValue, By by) {
		try {

			WebElement dropDownElement = driver.findElement(by);
			Select dropDown = new Select(dropDownElement);
			dropDown.selectByValue(attributeValue);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***
	 * This method is use for click the webElement button
	 * 
	 * @param by
	 */
	public void clickButton(By by) {
		try {
			WebElement button = driver.findElement(by);
			button.click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getCurrentTime() {

		String finalTimeStamp = null;
		Date date = new Date();

		String tempTime = new Timestamp(date.getTime()).toString();
		// logger.info("original time stamp is " + tempTime);
		System.out.println("original time stamp is " + tempTime);
		finalTimeStamp = tempTime.replace(":", "_").replace(" ", "_").replace(".", "_").replace("-", "_");
		// logger.info(finalTimeStamp);
		System.out.println(finalTimeStamp);
		return finalTimeStamp;
	}

	/***
	 * 
	 * This method is for captured the screenshot
	 */

	public String captureScreenShot(String screenshotFileName, String filePath) {
		String screenshotPath = null;
		String timestamp = getCurrentTime();
		try {
			if (!filePath.isEmpty()) {
				checkDirectory(filePath);
				screenshotPath = filePath + screenshotFileName + timestamp + ".png";
			} else {
				checkDirectory("target/screenshots/");
				screenshotPath = "target/screenshots/" + screenshotFileName + timestamp + ".png";
			}
			// This code is for capture screen
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// this is for store the captured file
			Files.copy(srcFile, new File(screenshotPath));

		} catch (Exception e) {
			// logger.error("Error: ", e);
			e.printStackTrace();
			assertTrue(false);
		}
		System.out.println("Screenshot captured: " + screenshotPath);
		// logger.info("Screenshot captured: " + screenshotPath);
		return screenshotPath;
	}

	/***
	 * This method is use for make file for screenshot
	 * 
	 * @param inputPath
	 * @return
	 */
	private String checkDirectory(String inputPath) {
		File file = new File(inputPath);
		String abPath = file.getAbsolutePath();
		File file2 = new File(abPath);
		if (!file2.exists()) {
			if (file2.mkdirs()) {
				// logger.info("folders created...");
				System.out.println("folders created...");
			} else {
				// logger.info("folders are not created...");
				System.out.println("folders are not created...");
			}
		}
		return abPath;

	}

}
