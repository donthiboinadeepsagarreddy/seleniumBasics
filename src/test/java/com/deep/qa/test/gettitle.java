package com.deep.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		String s=driver.getTitle();
		System.out.println(s);
		driver.findElement(By.xpath("//a[text()=\"Users\"]")).click();
		String s1=driver.getTitle();
		System.out.println(s1);
		driver.findElement(By.xpath("//a[text()=\"Reports\"]")).click();
		//String s2=driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//img[@alt=\"Logout\"]")).click();
		driver.close();
	}

}
