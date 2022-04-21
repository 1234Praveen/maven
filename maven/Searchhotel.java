package com.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel extends BaseClass{
	public Searchhotel() {
	PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="location")
	private WebElement ddlocation;
	@CacheLookup
	@FindBy(id="hotels")
	private WebElement ddhotels;
	@CacheLookup
	@FindBy(id="room_type")
	private WebElement ddrometype;
	@CacheLookup
	@FindBy(id="room_nos")
	private WebElement ddroomnumber;
	@CacheLookup
	@FindBy(id="adult_room")
	private WebElement ddadultroom;
	@CacheLookup
	@FindBy(id="child_room")
	private WebElement ddchildroom;
	@CacheLookup
	@FindBy(id="Submit")
	private WebElement btnsearch;
	public WebElement getDdlocation() {
		return ddlocation;
	}
	public WebElement getDdhotels() {
		return ddhotels;
	}
	public WebElement getDdrometype() {
		return ddrometype;
	}
	public WebElement getDdroomnumber() {
		return ddroomnumber;
	}
	public WebElement getDdadultroom() {
		return ddadultroom;
	}
	public WebElement getDdchildroom() {
		return ddchildroom;
	}
	public WebElement getBtnsearch() {
		return btnsearch;
	}
	

}
