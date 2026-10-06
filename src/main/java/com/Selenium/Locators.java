package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		// driver.navigate().to("https://www.amazon.in/");
		 //Thread.sleep(4000);
		 //id locator
		 //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
		 //driver.findElement(By.id("nav-search-submit-button")).click();
		 
		 driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("email")).sendKeys("abcd123@gmail.com");
	}

}
