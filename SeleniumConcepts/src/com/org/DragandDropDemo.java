package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemo {

	public DragandDropDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91960\\eclipse-workspace\\MyProject\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(5000);
		Actions ac1=new Actions(driver);
		WebElement e= driver.findElement(By.xpath("//div[@id='closeBtn']"));
		ac1.doubleClick(e).build().perform();
		 
		WebElement element = driver.findElement(By.linkText(" 					DEBIT SIDE"));
		
		Actions ac2= new Actions(driver);
		ac2.moveToElement(element);
		
		WebElement ds = driver.findElement(By.xpath("//li[@class='sel4 ui-draggable' and  @id='credit0']"));
		WebElement drop = driver.findElement(By.xpath("//div[@class='ui-widget-content']//ol[@id='amt7']"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(ds,drop);
		

	}
}
