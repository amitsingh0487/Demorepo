package com.Omnient.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Omnient.qa.base.TestBase;
import com.Omniet.qa.Pages.HomePage;

public class HomePageTest extends TestBase {
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void SetUp() {
		initialization();
		homePage = new HomePage();
	}
	
	@Test(priority=1) 
	public void ContactTextTest() {
		String Text = homePage.ValidateContactText();
		Assert.assertEquals(Text,"Contact");
		
	}
	@Test(priority=2)
	public void CompanyLogoTest() {
		boolean flag = homePage.VerifyCompanyLogo();
		Assert.assertTrue(flag);
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}
