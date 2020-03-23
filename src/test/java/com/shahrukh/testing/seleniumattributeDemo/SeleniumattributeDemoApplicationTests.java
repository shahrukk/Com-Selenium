package com.shahrukh.testing.seleniumattributeDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumattributeDemoApplicationTests {
	
	WebDriver driver;
	
	@BeforeEach
	void setup() {
		driver= new ChromeDriver();
	}

	@Test
	void contextLoads() throws Exception{
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		sleepNsec(2);
		driver.findElement(By.name("q")).sendKeys("tutorialspoin");
		sleepNsec(2);
		//driver.findElement(By.name("q")).submit();
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		sleepNsec(2);
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
