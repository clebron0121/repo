package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pass {

	WebDriver driver;
	
	@FindBy(id="ap_password")
	WebElement passField;
	
	@FindBy(id="signInSubmit")
	WebElement loginBt;
	public void enterPass(String e) {
		passField.sendKeys(e);
	}
	public void clickloginBt() {
		loginBt.click();
	}
	public pass(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
}
