package com.page_object_manager;

import org.openqa.selenium.WebDriver;

import com.pom.adactin.Book_Hotel;
import com.pom.adactin.Confirmation;
import com.pom.adactin.Login_Page;
import com.pom.adactin.Search_Hotel;
import com.pom.adactin.Select_Hotel;


public class Adactin_POManager {

	public WebDriver driver;

	// Adactin_Hotel

	private Login_Page login;

	private Search_Hotel hotel;

	private Select_Hotel select;

	private Book_Hotel book;

	private Confirmation confirm;

	public Adactin_POManager(WebDriver driver) {
		this.driver = driver;
	}

	public Login_Page getLogin() {
		if (login == null) {
			login = new Login_Page(driver);
		}
		return login;
	}

	public Search_Hotel getHotel() {
		if (hotel == null) {
			hotel = new Search_Hotel(driver);
		}
		return hotel;
	}

	public Select_Hotel getSelect() {
		if (select == null) {
			select = new Select_Hotel(driver);
		}
		return select;
	}

	public Book_Hotel getBook() {
		if (book == null) {
			book = new Book_Hotel(driver);
		}
		return book;
	}

	public Confirmation getConfirm() {
		if (confirm == null) {
			confirm = new Confirmation(driver);
		}
		return confirm;
	}

	

}
