package com.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends BaseClass {
	public Booking() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="//a [text()='Booked Itinerary']")
	private WebElement booked;

	public WebElement getBooked() {
		return booked;
	}
	

}
