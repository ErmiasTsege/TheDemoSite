package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class DemoSiteTest {

	private WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1366, 768));
	}

	// 1
	@Test
	public void successfulyAddUser() throws InterruptedException {
		final String username = "Abebe";
		final String password = "Kebede";
		driver.get(TheDemoSitePage.URL);
		TheDemoSitePage landingPage = new TheDemoSitePage(driver);
		landingPage.addUser();
		Thread.sleep(7000);
		AddUser adduse = PageFactory.initElements(driver, AddUser.class);
		adduse.adduser2(username, password);
		Thread.sleep(7000);

	}

//2
	@Test
	public void testsuccessfulylogin() throws InterruptedException {
		final String username = "Abebe";
		final String password = "Kebede";
		driver.get(TheDemoSitePage.URL);
		TheDemoSitePage loginpage = new TheDemoSitePage(driver);
		loginpage.Login();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.Login2(username, password);

		assertEquals("**Successful Login**", driver.findElement(By.cssSelector(
				"body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"))
				.getText());
		// Thread.sleep(7000);
	}

	@After
	public void tearDown() {
		driver.close();
	}
}