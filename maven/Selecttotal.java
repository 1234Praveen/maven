package com.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecttotal extends BaseClass {
	public Selecttotal() {
	PageFactory.initElements(driver, this);	
	}
	@CacheLookup
	@FindBy(id="radiobutton_0")
	private WebElement btnradio;
	@CacheLookup
	@FindBy(id="continue")
	private WebElement btncontinue;
	public WebElement getBtnradio() {
		return btnradio;
	}
	public WebElement getBtncontinue() {
		return btncontinue;
	}
	

}
