package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.Driver;

public final class HomePage {
	private final By linkLogin = By.xpath("//a[@href='/login']");
	public LoginPage clickLoginLink()
	{
		Driver.getDriver().findElement(linkLogin).click();
		return new LoginPage();
	}

}
