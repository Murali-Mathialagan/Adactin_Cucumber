package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	
	@FindBy(xpath = "//td//child::input[@id='radiobutton_0']")
	private WebElement radioBtn;
	
	public Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	@FindBy(xpath = "//tr//descendant::input[@id='continue']")
	private WebElement continueBtn;
	
	

}
