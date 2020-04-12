package com.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutipleDropdownDemo {

	public MutipleDropdownDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91960\\eclipse-workspace\\MyProject\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
WebElement selectoptions = driver.findElement(By.id("multi-select"));
Select s=new Select(selectoptions);

boolean multiple = s.isMultiple();
Thread.sleep(2000);
if(multiple) {
s.selectByVisibleText("California");
s.selectByValue("New York");
s.selectByIndex(4);
Thread.sleep(2000);

List<WebElement> all = s.getAllSelectedOptions();

/*for (int i = 0; i < all.size(); i++) {
	System.out.println(all.get(i).getText());
	
	
}*/
for (WebElement selected : all) {
	System.out.println(selected.getText());
	
	
}
	Thread.sleep(2000);
	s.deselectByValue("New York");
	
}
	}
}


