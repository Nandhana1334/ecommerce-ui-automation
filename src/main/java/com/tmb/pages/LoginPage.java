package com.tmb.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.driver.Driver;
import com.tmb.utils.WaitUtility;

public final class LoginPage {
	
	
	private final By txtUsername = By.xpath("//form[@action='/login']//input[@name='email']");
	private final By txtPassword = By.xpath("//form[@action='/login']//input[@name='password']");
	private final By btnSubmit = By.xpath("//button[@data-qa='login-button']");
	public LoginPage enterUsername(String username)
	{
		Driver.getDriver().findElement(txtUsername).sendKeys(username);
		return this;
	}
	
	public LoginPage enterPassword(String password)
	{
		WaitUtility.waitForVisibility(txtPassword, 10);
		Driver.getDriver().findElement(txtPassword).sendKeys(password);
		return this;
	}
	
	
	public LoginPage submitLogin()
	{
		Driver.getDriver().findElement(btnSubmit).click();
		return this;
	}
	
	

}
