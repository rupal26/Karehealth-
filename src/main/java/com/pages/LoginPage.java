package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


private WebDriver driver;

// 1. By Locators: OR
private By username  = By.className("form-control");
private By password = By.xpath("//input[@name='password']");
private By signInButton = By.xpath("//button[contains(text(),'Login')]");


//2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName() {
		driver.findElement(username).sendKeys("admin");
	}

	public void enterPassword () {
		driver.findElement(password).sendKeys("admin");
	}

	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}

}


