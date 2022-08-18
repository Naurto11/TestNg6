package org.Base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sam extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		
		maxBrowser();
		passUrl("https://en-gb.facebook.com/");
		
		WebElement findElement = driver.findElement(By.id("email"));
		
		toInput(findElement, excelReadGeneral(1, 2));
		
	}

}
