package com.bit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Shared {
	
	public static void type(WebElement element, String text) {
		element.sendKeys(text);
	}
	public static void type(By by, String text) {
		By.className("ClassName");
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void click(List<WebElement> elements, int index) { //why did we use the "list" utility?
		elements.get(index).click();
	}
	
}
