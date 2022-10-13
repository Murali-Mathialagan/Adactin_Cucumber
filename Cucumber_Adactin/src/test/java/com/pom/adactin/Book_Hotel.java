package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//span[@class='reg_error']//following::input[@id='first_name']")
	private WebElement fname;
	
	@FindBy(xpath = "//span[@class='reg_error']//following::input[@id='last_name']")
	private WebElement lname;
	
	@FindBy(xpath = "//label[@id='address_span']//preceding-sibling::textarea")
	private WebElement address;
	
	@FindBy(xpath = "//td//descendant::input[@id='cc_num']")
	private WebElement ccNo;
	
	@FindBy(xpath = "//select[@id='cc_type']//child::option[.='VISA']")
	private WebElement ccType;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']//child::option[.='March']")
	private WebElement expMonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']//child::option[.='2022']")
	private WebElement expYear;
	
	@FindBy(xpath = "//td//child::input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath = "//input[@id='cc_cvv']//following::input[@id='book_now']")
	private WebElement bookNow;
	
	// second booking
	
	@FindBy(xpath = "//select[@id='cc_type']//child::option[.='Master Card']")
	private WebElement ccType2;
	
	public WebElement getCcType2() {
		return ccType2;
	}

	public WebElement getExpMonth2() {
		return expMonth2;
	}

	public WebElement getExpYear2() {
		return expYear2;
	}

	@FindBy(xpath = "//select[@id='cc_exp_month']//child::option[.='December']")
	private WebElement expMonth2;

	@FindBy(xpath = "//select[@id='cc_exp_year']//child::option[.='2017']")
	private WebElement expYear2;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	
	
}
