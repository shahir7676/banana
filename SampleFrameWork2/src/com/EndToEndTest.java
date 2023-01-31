package com;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndTest extends BaseTest {
	@Test
	public void buyshirt() {
		ChromeDriver driver = getDriver(); //navigate to url
		HomePage hp = new HomePage(driver); //navigate to homepage
		hp.verifyhomepagelogo();  //verify logo
		hp.hoveroveronmenmenu();  //hover over men menu	
	}
	@Test
	public void buyjewelry() {
		ChromeDriver driver = getDriver(); //navigate to url
		HomePage hp = new HomePage(driver); //navigate to homepage
		hp.verifyhomepagelogo();  //verify logo
		hp.hoveroveronmenmenu();  //hover over men menu	
	}

}
