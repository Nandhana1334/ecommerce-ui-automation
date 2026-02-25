package com.tmb.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.driver.Driver;

public final class WaitUtility {
	
	public static void waitForVisibility(By by, int timeout)
	{
		new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
