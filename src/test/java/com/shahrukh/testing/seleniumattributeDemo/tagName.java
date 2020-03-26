package com.shahrukh.testing.seleniumattributeDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
	
	WebDriver driver;
	
	@BeforeEach
	void setup() throws Exception {
		driver = new ChromeDriver();
	}
	
	@Test
	public void getTagName() {
		driver.manage().window().maximize();
		sleepNsec(2);
		String baseUrl = "https://www.facebook.com/";
		sleepNsec(2);
		driver.get(baseUrl);
		String tagName = driver.findElement(By.id("email")).getTagName();
		String cssValue = driver.findElement(By.id("email")).getCssValue("font");
		String cssSelector = driver.findElement(By.cssSelector("input#email")).getCssValue("color");
		String linkName = driver.findElement(By.linkText("Log In")).getCssValue("background-color");
		String partialLink = driver.findElement(By.partialLinkText("Log")).getTagName();
		Dimension size = driver.findElement(By.id("email")).getSize();
		Point location = driver.findElement(By.id("email")).getLocation();
		String title = driver.getTitle();
		int titleLenght = title.length();
        System.out.println("The tag name of this field :"+tagName);
        System.out.println("The font size of this field :"+cssValue);
        System.out.println(title);
        System.out.println("The title lenght :" +titleLenght);
        System.out.println("The color of this field :" +cssSelector);
        System.out.println("The background color :" +linkName);
        System.out.println("The tag name :" +partialLink);
        System.out.println("The size :"+size);
        System.out.println("The location :" +location);
	}
	
	private void sleepNsec(int i) {
		try {
			Thread.sleep(i*1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@AfterEach
	void tearDown() throws Exception{
		driver.quit();
	}

}
