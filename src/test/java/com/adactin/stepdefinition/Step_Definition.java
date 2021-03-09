package com.adactin.stepdefinition;

import javax.naming.ConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.adactin.runner.Runner;
import com.adactin_Pom.in.Confirmation;
import com.adactin_Pom.in.Login_Page;
import com.adactin_Pom.in.Logout_btn;
import com.adactin_Pom.in.Name_registation;
import com.adactin_Pom.in.Register_btn;
import com.adactin_base.in.Selenium_Base_class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Selenium_Base_class {

	public static WebDriver driver = Runner.driver;

	// Objects
	Login_Page login = new Login_Page(driver);
	Register_btn reg = new Register_btn(driver);
	Confirmation conf = new Confirmation(driver);
	Name_registation Name_btn = new Name_registation(driver);
	Logout_btn log = new Logout_btn(driver);

	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {

		geturl("https://adactinhotelapp.com/");

	}

	@When("^user enter the username in username field$")
	public void user_enter_the_username_in_username_field() throws Throwable {

		Inputvalueelement(login.getLogin_btn(), "kArthik3073");

	}

	@When("^user enter the password in password field$")
	public void user_enter_the_password_in_password_field() throws Throwable {
		Inputvalueelement(login.getPassword(), "6IL308");

	}

	@Then("^user click on the login button It Navigates to the select homepage$")
	public void user_click_on_the_login_button_It_Navigates_to_the_select_homepage() throws Throwable {
		clickonelement(login.getLogin_click());

	}

	@When("^user select the hotel location$")
	public void user_select_the_hotel_location() throws Throwable {
		dropdown(reg.getLocation_1(), "byvisibletext", "Sydney");
	}

	@When("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
		dropdown(reg.getHotel_1(), "byvisibletext", "Hotel Creek");

	}

	@When("^user select the room type$")
	public void user_select_the_room_type() throws Throwable {
		dropdown(reg.getRoom(), "byvisibletext", "Standard");
	}

	@When("^user select the number of rooms$")
	public void user_select_the_number_of_rooms() throws Throwable {
		dropdown(reg.getRoom_no(), "byindex", "1");
	}

	@When("^user select the check in date$")
	public void user_select_the_check_in_date() throws Throwable {
		Inputvalueelement(reg.getDate_pick(), "05/02/2021");
	}

	@When("^user select the check out update$")
	public void user_select_the_check_out_update() throws Throwable {
		Inputvalueelement(reg.getDate_pick1(), "06/02/2021");
	}

	@When("^user select the adults per room$")
	public void user_select_the_adults_per_room() throws Throwable {

		Inputvalueelement(reg.getAdult_room(), "1 - One");
	}

	@When("^user select the children per room$")
	public void user_select_the_children_per_room() throws Throwable {
		Inputvalueelement(reg.getChild_room(), "1 - One");
	}

	@Then("^user click on the login button It Navigates to the select Hotelpage$")
	public void user_click_on_the_login_button_It_Navigates_to_the_select_Hotelpage() throws Throwable {
		clickonelement(reg.getSubmit());
	}

	@When("^user confirmation the hotel location$")
	public void user_confirmation_the_hotel_location() throws Throwable {
		clickonelement(conf.getRadio_btn());

	}

	@Then("^user click the continue Button IT Navigates to the select HotelPage$")
	public void user_click_the_continue_Button_IT_Navigates_to_the_select_HotelPage() throws Throwable {
		clickonelement(conf.getSubmit1());
	}

	@When("^user Enter the Valid First Name$")
	public void user_Enter_the_Valid_First_Name() throws Throwable {
		Inputvalueelement(Name_btn.getFirst_name(), "karthik");
	}

	@When("^user Enter the Valid Last Name$")
	public void user_Enter_the_Valid_Last_Name() throws Throwable {
		Inputvalueelement(Name_btn.getLast_name(), "keyan");
	}

	@When("^user Enter the Billing Address$")
	public void user_Enter_the_Billing_Address() throws Throwable {
		Inputvalueelement(Name_btn.getAddress(), "Avadi no:26 kandappan street");
	}

	@When("^user Enter the Valid Credit card Number$")
	public void user_Enter_the_Valid_Credit_card_Number() throws Throwable {
		Inputvalueelement(Name_btn.getCc_num(), "3073123430731234");
	}

	@When("^user choose the Credit card Type$")
	public void user_choose_the_Credit_card_Type() throws Throwable {
		dropdown(Name_btn.getCc_num1(), "byvisibletext", "VISA");
	}

	@When("^user select the select Month$")
	public void user_select_the_select_Month() throws Throwable {
		dropdown(Name_btn.getExp_month(), "byindex", "6");
	}

	@When("^user select the year$")
	public void user_select_the_year() throws Throwable {
		dropdown(Name_btn.getYear(), "byindex", "5");
	}

	@When("^user the cvv number$")
	public void user_the_cvv_number() throws Throwable {
		Inputvalueelement(Name_btn.getCvv_number(), "3073");
	}

	@Then("^user book now the hotel$")
	public void user_book_now_the_hotel() throws Throwable {
		clickonelement(Name_btn.getBook_now());
		sleep(2000);
	}

	@Then("^user the logout page$")
	public void user_the_logout_page() throws Throwable {
		sleep(5000);
		clickonelement(log.getLogout_btn());
	}

}
