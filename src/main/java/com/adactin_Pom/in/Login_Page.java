package com.adactin_Pom.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement login_btn;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement login_click;

	public WebElement getLogin_click() {
		return login_click;
	}

	public Login_Page(WebDriver driver1) {
		this.driver = driver1;

		PageFactory.initElements(driver1, this);

	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	public WebElement getPassword() {
		return password;
	}

}
