package com.deep.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdrivermanager {
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
	    InternetExplorerDriver driver=new InternetExplorerDriver();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("dwyane");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("johnson");
		String s= driver.getTitle();
		System.out.println(s);
		//driver.close();
		driver.quit();
		}
}
