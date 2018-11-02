package com.Omniet.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

import com.Omnient.qa.base.TestBase;

public class ContactPage extends TestBase{
	@FindBy(xpath=".//*[@id='heading']/div[1]/div[1]/img")
	WebElement ContactDeutcheBorsheLogo;
	
	@FindBy(xpath=".//*[@id='content']/h1")
	WebElement ContactPageTitleText;
	
	@FindBy(id="contact")
	WebElement contact;
	
	public ContactPage() {
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
    
	public String ContactPageHeader() {
		return ContactPageTitleText.getText();
	}
	public boolean ContactPageCompanyLogo() {
		return ContactDeutcheBorsheLogo.isDisplayed();
	}
	public void NavigateContact() {
		contact.click();
	}
}
