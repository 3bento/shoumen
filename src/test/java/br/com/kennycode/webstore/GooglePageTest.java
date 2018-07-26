package br.com.kennycode.webstore;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GooglePageTest {

	private WebDriver driver;

	@Before
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("version", "61.0.1");
		capabilities.setCapability("platform", Platform.LINUX);
		capabilities.setCapability("name", "");
		this.driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void googleTest() throws InterruptedException {
		this.driver.get("http://www.google.com");
		assertEquals("Google", this.driver.getTitle());
	}

	@After
	public void tearDown() {
		this.driver.quit();
	}
}
