package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenAutomation {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Ajith\\OneDrive\\Desktop\\aji\\project\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver .get(" http://demo.automationtesting.in/Register.html");

			WebElement selectskills = driver.findElement(By.id("skills"));
			selectskills.sendKeys();
			

			
}
}