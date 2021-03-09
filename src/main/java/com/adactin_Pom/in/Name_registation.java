package com.adactin_Pom.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Name_registation {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first_name;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement last_name;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement cc_num;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cc_num1;

	@FindBy(name = "cc_exp_month")
	private WebElement exp_month;

	@FindBy(xpath = "(//select[@class='select_combobox2'])[2]")
	private WebElement year;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv_number;

	@FindBy(name = "book_now")
	private WebElement book_now;

	public Name_registation(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_num1() {
		return cc_num1;
	}

	public WebElement getExp_month() {
		return exp_month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv_number() {
		return cvv_number;
	}

	public WebElement getBook_now() {
		return book_now;
	}

}
