package com.deep.qa.test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=\"Reports\"]")).click();
		String mainwindow = driver.getWindowHandle();
		List<WebElement> e = driver.findElements(By.xpath("//img[@alt=\"Click Here to Pick up the date\"]"));
		e.get(1).click();
		Set<String> allwindows = driver.getWindowHandles();
		for (String s : allwindows) {
			if (!s.equals(mainwindow)) {
				driver.switchTo().window(s);
				break;
			}
		}
		List<WebElement> e1 = driver.findElements(By.xpath("//span[text()=\"1\"]"));
		e1.get(1).click();
		driver.switchTo().window(mainwindow);
		driver.close();
	}
}
