package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public AlertsDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91960\\eclipse-workspace\\MyProject\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		simple.click();
		Thread.sleep(2000);
Alert salert = driver.switchTo().alert();
salert.accept();
Thread.sleep(2000);


WebElement confirm = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
confirm.click();
Thread.sleep(2000);
Alert calert = driver.switchTo().alert();
//calert.accept();
calert.dismiss();
Thread.sleep(2000);



	}

}
