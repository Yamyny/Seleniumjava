package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      //css selector using attribute 
      driver.get("https://www.instagram.com/");
      Thread.sleep(4000);
      driver.findElement(By.cssSelector("input[name='email']")).sendKeys("1234");
      //css selectors using starts with
      driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("1234");
      driver.findElement(By.cssSelector("div[class$='mpni']")).click();
      
      
	}
}	
	