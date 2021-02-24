package com.deep.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popups {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Users\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Add New User\"]")).click();
		driver.findElement(By.name("username")).sendKeys("bigbull");
		driver.findElement(By.xpath("//a[text()=\"Reports\"]")).click();
		System.out.println("clicking on reports");
		driver.findElement(By.xpath("//input[@value=\"Remain on the Page\"]")).click();
		System.out.println("we got a color popup");
		driver.findElement(By.xpath("//input[@value=\"      Cancel      \"]")).click();
		System.out.println("clicked on cancel btn");
		String e=driver.switchTo().alert().getText();
		System.out.println("we got an popup regarding ok or cancel the addding user");
		System.out.println(e);
		driver.switchTo().alert().dismiss();
		System.out.println("clicked on cancel");
		driver.findElement(By.xpath("//input[@value=\"      Cancel      \"]")).click();
		System.out.println("clicked on ok");
		driver.switchTo().alert().accept();
		driver.close();

	}
}
