package com.tmb.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.tmb.driver.Driver;

public final class LoginPage extends BaseTest {
	//private constructor so that object cannot be created
	private LoginPage()
	{
		
	}
	@Test
	public void test1()
	{
		Driver.driver.findElement(By.name("q")).sendKeys("hi");
	}
	

}
