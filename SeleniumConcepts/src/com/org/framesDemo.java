package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesDemo {

	public framesDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91960\\eclipse-workspace\\MyProject\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
	WebElement frame1 = driver.findElement(By.id("singleframe"));
	driver.switchTo().frame(frame1);
	
	WebElement txtbox = driver.findElement(By.xpath("//input[@type='text']"));
	txtbox.sendKeys("pooja");
		
	driver.switchTo().defaultContent();
	}

}
