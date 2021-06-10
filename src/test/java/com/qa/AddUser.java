package com.qa;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class AddUser {
	private final static String URL = "http://thedemosite.co.uk/addauser.php";

	private WebDriver driver;


	public AddUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement usernameinput;


	@FindBy(name = "password")
	private WebElement passwordinput;
	@FindBy(name = "FormsButton2")
	private WebElement addbutton;

	public void adduser2(String username, String password) {

		usernameinput.sendKeys(username);
		passwordinput.sendKeys(password);
		addbutton.click();

	}

}
