package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	static ChromeDriver driver = null; //non static can't go inside the static unless you use object or reference
	public static ChromeDriver getDriver() {
		driver = new ChromeDriver();
		driver.get("https://www.express.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public void closebrowser() {
		driver.quit();
	}

}
