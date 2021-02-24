package com.deep.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class copypaste {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Users\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Add New User\"]")).click();
		driver.findElement(By.name("username")).sendKeys("naveen");
//		driver.findElement(By.name("username")).sendKeys(Keys.CONTROL+"a"+Keys.CONTROL+"c");
//		driver.findElement(By.name("firstName")).sendKeys(Keys.CONTROL+"v");
		//or
		Actions a= new Actions(driver);
		a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		System.out.println("data as been selected from the textbox");
		a.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		System.out.println("data has been copied from textbox");
		driver.findElement(By.name("firstName")).click();
		a.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		System.out.println("data paste into the firstname");
		driver.quit();
		}

}
