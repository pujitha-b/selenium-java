package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiondDemo {

	public ActiondDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91960\\eclipse-workspace\\MyProject\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		WebElement Tshirt = driver.findElement(By.xpath("//a[@title='T-shirts']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(women).perform();
		Thread.sleep(2000);
		ac.click(Tshirt).perform();
		

	}

}
