package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public XPath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91960\\eclipse-workspace\\MyProject\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		boolean enabled = mail.isEnabled();
		System.out.println(enabled);
		mail.sendKeys("poojitha.49@gmail.com");
		Thread.sleep(1000);
		

	}

}
