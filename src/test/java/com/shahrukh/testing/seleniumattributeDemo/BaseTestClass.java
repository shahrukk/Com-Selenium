package com.shahrukh.testing.seleniumattributeDemo;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTestClass {
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeEach
	void setup() throws Exception {
		driver = new ChromeDriver();
	}
	
	@Test
	public void startUpBrowser() throws Exception {
		try {
		//driver.manage().window().fullscreen();
		String baseUrl = "https://app.pluralsight.com/library/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		sleepNsec(2);
		driver.findElement(By.id("Username")).sendKeys("shahrukk");
		driver.findElement(By.id("Password")).sendKeys("India@123");
		driver.findElement(By.id("login")).click();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void sleepNsec(int i) {
		try {
			Thread.sleep(i*1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@AfterEach
	void tearDown() throws InterruptedException {
		driver.quit();
	}

}
