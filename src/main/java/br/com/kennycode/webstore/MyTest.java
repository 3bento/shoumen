package br.com.kennycode.webstore;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyTest {

	public static void main(String[] args) throws Exception {
		myTest();
	}

	public static void myTest() throws Exception {
		
		FirefoxProfile fp = new FirefoxProfile();
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, fp);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);

		driver.get("http://www.google.com");

		// RemoteWebDriver does not implement the TakesScreenshot class
		// if the driver does have the Capabilities to take a screenshot
		// then Augmenter will add the TakesScreenshot methods to the instance
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File screenshot = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);
		System.out.println(screenshot.exists() + "  -   " + screenshot);
		driver.quit();
	}
}
