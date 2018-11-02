package com.Omnient.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Omnient.qa.base.TestBase;
import com.Omniet.qa.Pages.ContactPage;
//import com.Omniet.qa.Pages.HomePage;

public class ContactPageTest extends TestBase {
	ContactPage contactPage;
	
	public  ContactPageTest() {
		super();
	}
	@BeforeMethod
	public void SetUp() {
		initialization();
        contactPage = new ContactPage();
        
	}
	@Test(priority=1)
	public void ContactPageHeaderTest() {
		contactPage.NavigateContact();
		String ContactPageHeaderText= contactPage.ContactPageHeader();
		Assert.assertEquals(ContactPageHeaderText,"Omnient Digital | Contact");
	}
	@Test(priority=2)
	public void ContactPageCompanyLogoTest() {
		contactPage.NavigateContact();
		boolean ContactLogoFlag =contactPage.ContactPageCompanyLogo();
		Assert.assertTrue(ContactLogoFlag);
	}
    
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
