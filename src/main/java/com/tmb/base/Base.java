package com.tmb.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tmb.driver.Driver;

public class Base {

	protected Base()
	{
		
	}
		@BeforeMethod
		public void setUp()
		{
			Driver.initDriver();
		}
		
		@AfterMethod
		public void tearDown()
		{
			Driver.quitDriver();
		}
	
	
}
