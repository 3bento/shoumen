package br.com.kennycode.webstore.controller;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomeControllerTest {

	private WebDriver driver;

	// GOOD WAY!!
	// @FindBy()
	// private WebElement linkToSignIn;
	//
	// @FindBy()
	// private WebElement linkToSignUp;

	// TODO - WHERE IS THE LOGGSSS??????????????????

	@Before
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("version", "61.0.1");
		capabilities.setCapability("platform", Platform.LINUX);
		capabilities.setCapability("name", "");
		this.driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void opeHomePageTest() {
		this.driver.get("http://200.210.10.240:8080/shoumen/");
		assertEquals("Shoumen - homepage", this.driver.getTitle());
	}

	@Test
	public void homeToSignInTest() {
		this.driver.get("http://200.210.10.240:8080/shoumen/");
		WebElement element = this.driver.findElement(By.name("toSignIn"));
		element.click();
		 this.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		 assertEquals("Shoumen - signin", this.driver.getTitle());
		
	}

	@Test
	public void homeToSignUpTest() {
		this.driver.get("http://200.210.10.240:8080/shoumen/");
		WebElement element = this.driver.findElement(By.name("toSignUp"));
		element.click();
		this.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		assertEquals("Shoumen - signup", this.driver.getTitle());
	}

	@After
	public void tearDown() {
		this.driver.quit();
	}
}
