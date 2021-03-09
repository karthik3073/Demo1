package com.adactin_Pom.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_btn {

	public static WebDriver driver;

	@FindBy(name = "logout")
	private WebElement logout_btn;

	public Logout_btn(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}

	public WebElement getLogout_btn() {
		return logout_btn;
	}

}
