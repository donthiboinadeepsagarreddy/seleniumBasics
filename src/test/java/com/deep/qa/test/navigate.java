package com.deep.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()=\"Users\"]")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println("backword");
		driver.findElement(By.xpath("//a[text()=\"Reports\"]")).click();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println("forword");
		driver.navigate().refresh();
		System.out.println("refresh");
		driver.findElement(By.xpath("//img[@alt=\"Logout\"]")).click();
		driver.close();
	}

}
