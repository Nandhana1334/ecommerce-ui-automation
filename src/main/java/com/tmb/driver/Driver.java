package com.tmb.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	public static WebDriver driver;
	public static void initDriver()
	{
		if(Objects.isNull(driver))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://google.com");
			
		}
		
	}
	public static void quitDriver()
	{
		if(Objects.nonNull(driver))
		{
			driver.quit();
			driver = null;
		}
	}

}
