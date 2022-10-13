package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	public WebDriver driver;
	
	@FindBy(xpath = "//input//following-sibling::input[@id='my_itinerary']")
	private WebElement itinerary;
	
	@FindBy(xpath = "//table[@class='content']//following::input[@id='logout']")
	private WebElement logOut;
	
	@FindBy(xpath = "//td//child::a[.='Click here to login again']")
	private WebElement loginAgain;

	public WebElement getLoginAgain() {
		return loginAgain;
	}

	public Confirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getLogOut() {
		return logOut;
	}
	

}
