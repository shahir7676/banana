package com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	public static boolean verifyelement(WebElement element) {
		return element.isDisplayed();
	}
	public static void hoveroverelement(ChromeDriver driver, WebElement element) { //hover over on men menu
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	public static void click(WebElement element) {  //click on new arrival
		element.click();
	}
	public static void selectfromdropdown(WebElement element, String option) {
		Select s = new Select(element);
		s.selectByVisibleText(option);  //the way it's displayed on UI level
	}

}
