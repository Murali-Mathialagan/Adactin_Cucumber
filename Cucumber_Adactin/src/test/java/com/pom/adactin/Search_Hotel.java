package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;

	@FindBy(xpath = "//select[@id='location']//child::option[@value='London']")
	private WebElement location;

	@FindBy(xpath = "//select[@id='hotels']//child::option[@value='Hotel Sunshine']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@id='room_type']//child::option[.='Super Deluxe']")
	private WebElement roomType;

	@FindBy(xpath = "//select[@id='room_nos']//child::option[.='2 - Two']")
	private WebElement roomNos;

	@FindBy(xpath = "//tr//descendant::input[@id='datepick_in']")
	private WebElement checkIn;
	
	@FindBy(xpath = "//td[@align='right']//following::input[@id='datepick_out']")
	private WebElement checkOut;

	@FindBy(xpath = "//select[@id='adult_room']//child::option[.='2 - Two']")
	private WebElement adultRoom;

	@FindBy(xpath = "//select[@id='child_room']//child::option[.='3 - Three']")
	private WebElement childrenRoom;

	@FindBy(xpath = "//input[@id='Reset']//preceding-sibling::input")
	private WebElement search;
	
	//Second Hotel
	
	@FindBy(xpath = "//select[@id='location']//child::option[@value='Melbourne']")
	private WebElement location2;
	
	@FindBy(xpath = "//select[@id='hotels']//child::option[@value='Hotel Creek']")
	private WebElement hotels2;

	@FindBy(xpath = "//select[@id='room_type']//child::option[.='Double']")
	private WebElement roomType2;

	@FindBy(xpath = "//select[@id='room_nos']//child::option[.='4 - Four']")
	private WebElement roomNos2;

	@FindBy(xpath = "//tr//descendant::input[@id='datepick_in']")
	private WebElement checkIn2;
	
	@FindBy(xpath = "//td[@align='right']//following::input[@id='datepick_out']")
	private WebElement checkOut2;

	@FindBy(xpath = "//select[@id='adult_room']//child::option[.='4 - Four']")
	private WebElement adultRoom2;

	@FindBy(xpath = "//select[@id='child_room']//child::option[.='4 - Four']")
	private WebElement childrenRoom2;


	public WebElement getLocation2() {
		return location2;
	}

	public WebElement getHotels2() {
		return hotels2;
	}

	public WebElement getRoomType2() {
		return roomType2;
	}

	public WebElement getRoomNos2() {
		return roomNos2;
	}

	public WebElement getCheckIn2() {
		return checkIn2;
	}

	public WebElement getCheckOut2() {
		return checkOut2;
	}

	public WebElement getAdultRoom2() {
		return adultRoom2;
	}

	public WebElement getChildrenRoom2() {
		return childrenRoom2;
	}


	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildrenRoom() {
		return childrenRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	

}
