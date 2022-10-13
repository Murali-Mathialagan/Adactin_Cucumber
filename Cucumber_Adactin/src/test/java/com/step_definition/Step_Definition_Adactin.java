package com.step_definition;

import org.openqa.selenium.WebDriver;

import com.baseclass.Utility_Files;
import com.page_object_manager.Adactin_POManager;
import com.runner.Adactin_Runner_BDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition_Adactin extends Utility_Files {

	public static WebDriver driver = Adactin_Runner_BDD.driver;
	public static Adactin_POManager manager = new Adactin_POManager(driver);

	@Given("user {string} The Application")
	public void user_the_application(String url) {
		run_Url(url);
	}

	@When("user Enter The {string} In Username Textbox")
	public void user_enter_the_in_username_textbox(String username) {
		send_Keys(manager.getLogin().getUserName(), username);

	}

	@When("user Enter The {string} In Password Textbox")
	public void user_enter_the_in_password_textbox(String password) {
		send_Keys(manager.getLogin().getPassword(), password);

	}

	@Then("user Click The Login Button And It Navigates To Search Hotel Module")
	public void user_click_the_login_button_and_it_navigates_to_search_hotel_module() {
		click(manager.getLogin().getLogIn());
	}

	@When("user Select The Location In Location Dropdown Field")
	public void user_select_the_location_in_location_dropdown_field() {
		click(manager.getHotel().getLocation());
	}

	@When("user Select The Hotels In Hotel Dropdown Field")
	public void user_select_the_hotels_in_hotel_dropdown_field() {
		click(manager.getHotel().getHotels());
	}

	@When("user Select The Roomtype In Roomtype Dropdown Field")
	public void user_select_the_roomtype_in_roomtype_dropdown_field() {
		click(manager.getHotel().getRoomType());
	}

	@When("user Select The Number Of Rooms In Number Of Rooms Dropdown Field")
	public void user_select_the_number_of_rooms_in_number_of_rooms_dropdown_field() {
		click(manager.getHotel().getRoomNos());
	}

	@When("user Enter The {string} In CheckIn Date Field")
	public void user_enter_the_in_check_in_date_field(String checkIn) {
		clear(manager.getHotel().getCheckIn());
		send_Keys(manager.getHotel().getCheckIn(), checkIn);
	}

	@When("user Enter The {string} In Checkout Date Field")
	public void user_enter_the_in_checkout_date_field(String checkOut) {
		clear(manager.getHotel().getCheckOut());
		send_Keys(manager.getHotel().getCheckOut(), checkOut);

	}

	@When("user Select The Adults Per Room In Adults Per Room Dropdown Field")
	public void user_select_the_adults_per_room_in_adults_per_room_dropdown_field() {
		click(manager.getHotel().getAdultRoom());
	}

	@When("user Select The Children Per Room In Children Per Room Dropdown Field")
	public void user_select_the_children_per_room_in_children_per_room_dropdown_field() {
		click(manager.getHotel().getChildrenRoom());
	}

	@Then("user Click The Search Button And It Navigates To Select Hotel Module")
	public void user_click_the_search_button_and_it_navigates_to_select_hotel_module() {
		click(manager.getHotel().getSearch());
	}

	@When("user Click The Radio Button In Select Radio Button Field")
	public void user_click_the_radio_button_in_select_radio_button_field() {
		click(manager.getSelect().getRadioBtn());
	}

	@Then("user Click The Continue Button And It Navigates To Book A Hotel Module")
	public void user_click_the_continue_button_and_it_navigates_to_book_a_hotel_module() {
		click(manager.getSelect().getContinueBtn());
	}

	@When("user Enter The {string} In The First Name textbox")
	public void user_enter_the_in_the_first_name_textbox(String firstName) {

		send_Keys(manager.getBook().getFname(), firstName);
	}

	@When("user Enter The {string} In The Last Name Textbox")
	public void user_enter_the_in_the_last_name_textbox(String lastName) {
		send_Keys(manager.getBook().getLname(), lastName);

	}

	@When("user Enter The {string} In The Billing Address Textbox")
	public void user_enter_the_in_the_billing_address_textbox(String address) {
		send_Keys(manager.getBook().getAddress(), address);

	}

	@When("user Enter The {string} In The Credit Card No. Textbox")
	public void user_enter_the_in_the_credit_card_no_textbox(String ccNumber) {
		send_Keys(manager.getBook().getCcNo(), ccNumber);

	}

	@When("user Select The Credit Card Type In The Credit Card Type Dropdown Field")
	public void user_select_the_credit_card_type_in_the_credit_card_type_dropdown_field() {

		click(manager.getBook().getCcType());
	}

	@When("user Select The Expiry Month In The Expiry Month Dropdown Field")
	public void user_select_the_expiry_month_in_the_expiry_month_dropdown_field() {
		click(manager.getBook().getExpMonth());
	}

	@When("user Select The Expiry Year In The Expiry Year Dropdown Field")
	public void user_select_the_expiry_year_in_the_expiry_year_dropdown_field() {
		click(manager.getBook().getExpYear());
	}

	@When("user Enter The {string} In The CVV Number Textbox")
	public void user_enter_the_in_the_cvv_number_textbox(String cvv) {
		send_Keys(manager.getBook().getCvv(), cvv);
	}

	@Then("user Click The Book Now Button And It Navigates To Confirmation Module")
	public void user_click_the_book_now_button_and_it_navigates_to_confirmation_module() {
		click(manager.getBook().getBookNow());

	}

}
