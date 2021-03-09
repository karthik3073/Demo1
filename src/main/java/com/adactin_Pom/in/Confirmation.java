package com.adactin_Pom.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radio_btn;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit1;

	public Confirmation(WebDriver driver1) {

		this.driver = driver1;

		PageFactory.initElements(driver1, this);

	}

	public WebElement getSubmit1() {
		return submit1;
	}

	public WebElement getRadio_btn() {
		return radio_btn;

	}

}
