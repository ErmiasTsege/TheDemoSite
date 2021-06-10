package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private final static String URL = "http://thedemosite.co.uk/login.php";

	private WebDriver driver;


	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(name = "username")
	private WebElement usernameinput;


	@FindBy(name = "password")
	private WebElement passwordinput;

	@FindBy(name = "FormsButton2")
	private WebElement addbutton;

	public void Login2(String username, String password) {

		usernameinput.sendKeys(username);
		passwordinput.sendKeys(password);
		addbutton.click();
	}

}
