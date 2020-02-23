package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	public WebDriver driver;

	@FindBy(xpath = "//*[@id='nav-link-accountList']/span[1]")
	WebElement signin;

	public void clickSignin() {
		signin.click();
	}
	public home(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
}
