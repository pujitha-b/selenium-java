package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InspectElements {

	

	public InspectElements() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91960\\eclipse-workspace\\MyProject\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		//WebElement mail = driver.findElement(By.id("email"));
		//mail.sendKeys("pujithareddy1997@gmail.com");
		////Thread.sleep(1000);
		//WebElement passwrd = driver.findElement(By.id("pass"));
		//passwrd.sendKeys("Poojareddy@4997");
		//Thread.sleep(1000);
		//WebElement login = driver.findElement(By.id("u_0_b"));
		//login.click();
		WebElement firstname = driver.findElement(By.id("u_0_m"));
		firstname.sendKeys("pooja");
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.id("u_0_o"));
		lastname.sendKeys("reddy");
		Thread.sleep(2000);
		WebElement mobileno = driver.findElement(By.id("u_0_r"));
		mobileno.sendKeys("9600041384");
		Thread.sleep(2000);
		WebElement newpwd = driver.findElement(By.id("u_0_w"));
		newpwd.sendKeys("pooja1234@");
		Thread.sleep(2000);
		Select drpday=new Select(driver.findElement(By.id("day")));
		drpday.selectByValue("4");
		//Thread.sleep(2000);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("Sept");
		//Thread.sleep(1000);
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1997");
		Thread.sleep(2000);
		
		driver.close();
		
		
			
		}

		
	}


