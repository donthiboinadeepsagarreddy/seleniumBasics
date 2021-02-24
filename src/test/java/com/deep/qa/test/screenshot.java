package com.deep.qa.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenshot {
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(3000);
	  EventFiringWebDriver screenshot = new EventFiringWebDriver(driver);
	 File sourceloc= screenshot.getScreenshotAs(OutputType.FILE);
	 File desloc= new File("C:\\Users\\donthiboina\\Desktop\\New folder (2)\\deskse.jpg");
	 FileUtils.moveFile(sourceloc, desloc);
	 driver.close();
	}

}
