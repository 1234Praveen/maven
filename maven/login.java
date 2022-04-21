package com.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login extends BaseClass {
	public login() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="username")
	private WebElement txtName;
	@CacheLookup
	@FindBy(id="password")
	private WebElement txtPass;
	@CacheLookup
	@FindBy(id="login")
	private WebElement btnlogin;
	public WebElement getTxtName() {
		return txtName;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	

		
	

}
