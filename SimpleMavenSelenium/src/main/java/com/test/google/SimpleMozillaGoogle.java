package com.test.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SimpleMozillaGoogle {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}
	
}
