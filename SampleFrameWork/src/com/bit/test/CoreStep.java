package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreStep {
	
	ChromeDriver driver;
	
	public void typeUserId() {
		Shared.type(driver.findElement(By.id("email")), "user1");
	}
	
	public void typePassword() {
		Shared.type(driver.findElement(By.id("pass")), "p1234");
	}
	
	public void typeFirsName() {
		Shared.type(driver.findElement(By.id("First name")), "Shahir");
	}
	public void clickOnLoginButton() {
		Shared.click(driver.findElement(ObjectRepo.loginButton));
	}
	public CoreStep(ChromeDriver x) {
		driver = x;
	}
}
