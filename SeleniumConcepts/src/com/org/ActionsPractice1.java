package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice1 {

	public ActionsPractice1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91960\\eclipse-workspace\\MyProject\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		 WebElement TextBox = driver.findElement(By.xpath("//input[@name='firstName']"));
		 TextBox.sendKeys("pooja");
		 Thread.sleep(2000);
		
WebElement submit = driver.findElement(By.xpath("//button[@type='button']"));
submit.click();
Thread.sleep(2000);
WebElement doubleclick = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));

Actions ac=new Actions(driver);
ac.doubleClick(doubleclick).perform();
Thread.sleep(2000);

	}

}
