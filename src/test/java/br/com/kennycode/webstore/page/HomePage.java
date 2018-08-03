package br.com.kennycode.webstore.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="toSignIn")
	private WebElement linkToSignIn;
	
	@FindBy(id="toSignUp")
	private WebElement linkToSignUp;
	
	private WebDriver driver;
	public static String URL = "http://200.210.10.240:8080/shoumen/";
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void visitPage() {
		this.driver.get(URL);
	}
	
	public void openSignIn() {
		this.linkToSignIn.click();
	}
	
	public void openSignUp() {
		this.linkToSignUp.click();
	}
	
	public boolean isOnPage() {
		String title = "Shoumen - homepage";
		return this.driver.getTitle() == title;
	}
	
	
}
