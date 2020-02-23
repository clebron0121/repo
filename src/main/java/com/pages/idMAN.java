package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class idMAN {
WebDriver driver;

@FindBy(id="ap_email")
WebElement emailField;

@FindBy(id="continue")
WebElement contBt;


public void enterEmail(String g) {
	emailField.sendKeys(g);
}
public void clickCont() {
	contBt.click();
}
public idMAN(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
public void empty() {
	emailField.clear();
}

}
