package com.deep.qa.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chrome();
		firefox();
		
	}
public static void chrome()
{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://127.0.0.1:81/login.do");
	driver.close();
}
public static void firefox()
{
	System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://127.0.0.1:81/login.do");
	driver.close();
}
}
