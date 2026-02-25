package com.tmb.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.tmb.base.Base;
import com.tmb.driver.Driver;
import com.tmb.pages.HomePage;
import com.tmb.pages.LoginPage;

public final class LoginTest extends Base {
	//private constructor so that object cannot be created
	private LoginTest()
	{
		
	}
	@Test
	public void loginTest()
	{
		new HomePage()
		.clickLoginLink()
		.enterPassword("me13@gmail")
		.enterUsername("me13@gmail.com")
		.submitLogin();
	}
	

}
