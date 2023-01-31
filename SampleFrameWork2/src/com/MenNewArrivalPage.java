package com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenNewArrivalPage {
	
	ChromeDriver driver;
	
	public MenNewArrivalPage(ChromeDriver x) {	
		driver = x;
	}
	public void clickonfirstproduct() {
		Helper.click(driver.findElement(By.xpath("xpathoffirstproduct")));
	}

}