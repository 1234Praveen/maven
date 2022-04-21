package com.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookhotel extends BaseClass {
	public Bookhotel() {
    PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="first_name")
	private WebElement firstname;
	@CacheLookup
	@FindBy(id="last_name")
	private WebElement lastname;
	@CacheLookup
	@FindBy(id="address")
	private WebElement address;
	@CacheLookup
	@FindBy(id="cc_num")
	private WebElement creditcard;
	@CacheLookup
	@FindBy(id="cc_type")
	private WebElement credittype;
	@CacheLookup
	@FindBy(id="cc_exp_month")
	private WebElement expirymonth;
	@CacheLookup
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	@CacheLookup
	@FindBy(id="cc_cvv")
	private WebElement ccnumber;
	@CacheLookup
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditcard() {
		return creditcard;
	}
	public WebElement getCredittype() {
		return credittype;
	}
	public WebElement getExpirymonth() {
		return expirymonth;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getCcnumber() {
		return ccnumber;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	

}
