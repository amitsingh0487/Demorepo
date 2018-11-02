package com.Omniet.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Omnient.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(id="contact")
	WebElement contact;
	
	@FindBy(xpath=".//*[@id='heading']/div[1]/div[1]/img")
	WebElement DeutcheBorsheLogo;
	
	@FindBy(xpath =".//*[@id='omnient home']/a")
	WebElement OmnientHeader ;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String ValidateContactText() {
	    return contact.getText();
	    	 
	 }
	public boolean VerifyCompanyLogo() {
		return DeutcheBorsheLogo.isDisplayed();
	}
	

}
