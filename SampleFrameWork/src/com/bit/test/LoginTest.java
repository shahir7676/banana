package com.bit.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		BaseTest b = new BaseTest();
		ChromeDriver driver = b.getDriver();
		CoreStep s = new CoreStep(driver);
		s.typeUserId();
		s.typePassword();
		s.clickOnLoginButton();
		
		CoreStep s1 = new CoreStep(driver);
		s1.typeUserId();
		
		
	}

}
