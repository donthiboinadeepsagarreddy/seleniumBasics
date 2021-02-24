package com.deep.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://127.0.0.1:81/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	driver.findElement(By.xpath("//img[@alt=\"Logout\"]")).click();
	System.out.println("sss");
	driver.quit(); 
}
}
