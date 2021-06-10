package com.qa;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class TheDemoSitePage {

	public final static String URL = "http://thedemosite.co.uk/";

	private WebDriver driver;

	// 1
	public TheDemoSitePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// 2
	@FindBy(xpath = "//a[contains(text(),'3. Add a User')]")
	private WebElement adduser;
	///
	
	@FindBy(xpath = "//a[contains(text(),'4. Login')]")
	private WebElement login;

	public void addUser() {
		adduser.click();
	}
	

	public static String getUrl() {
		return URL;
	}

	public void Login() {
		login.click();
		}


}