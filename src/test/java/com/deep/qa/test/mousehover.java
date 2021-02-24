package com.deep.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/");
		WebElement e=driver.findElement(By.xpath("//span[text()=\"All PDF tools\"]"));
		Actions a= new Actions(driver);
		a.moveToElement(e).build().perform();
		driver.close();
	}

}
