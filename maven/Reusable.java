package com.maven;
import org.openqa.selenium.WebElement;

public class Reusable extends BaseClass {
	public static void main(String[] args) {
	
		Reusable r = new Reusable();
		
		r.browserconfigchrome();
		r.maximizewindow();
		r.openurl("http://www.facebook.com");
		WebElement txtusermail= r.locatedId("email");
		txtusermail.sendKeys("praveen@456");
		WebElement txtpassword = r.locatedId("pass");
		txtpassword.sendKeys("praveen");
		WebElement btnlogin = r.locatedbyname("login");
		btnlogin.click();
			
	}
}
