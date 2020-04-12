package com.org;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public SelectDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91960\\eclipse-workspace\\MyProject\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByIndex(9);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("9");
		Thread.sleep(2000);
		 WebElement year = driver.findElement(By.id("year"));
		 Select y = new Select(year);
		 y.selectByVisibleText("1997");
		 Thread.sleep(2000);
		 List<WebElement> options = m.getOptions();
		 for (WebElement mm: options) {
			 System.out.println(mm.getText());
		 }
			 TakesScreenshot ts = (TakesScreenshot) driver;
			 File srcfile = ts.getScreenshotAs(OutputType.FILE);
			 File destfile = new File("C:\\Users\\91960\\eclipse-workspace\\MyProject\\SeleniumConcepts\\Screenshot\\test.png");
			 FileUtils.copyFile(srcfile, destfile);
			 
		 }
			
		}
	
		
	


