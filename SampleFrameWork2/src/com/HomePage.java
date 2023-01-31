package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	ChromeDriver driver;
	@FindBy(xpath = "xpath of logo") WebElement homepagelogo; //using @findby annotation you can store your element (globally)
	@FindBy(xpath = "xpath of menmenu") WebElement menmenuCategory;
	public HomePage(ChromeDriver x) {	
		driver = x; 
		PageFactory.initElements(driver, this);  //(this) means that you are referring to this class
	}
	public void verifyhomepagelogo() {
		boolean result = Helper.verifyelement(homepagelogo);	
	}
	public void hoveroveronmenmenu() {
		Helper.hoveroverelement(driver, driver.findElement(By.xpath("xpathofmenmenu")));
	}
	public void clickonnewarrival() {
		Helper.click(driver.findElement(By.xpath("xpatthofnewarrival")));
	}
}
