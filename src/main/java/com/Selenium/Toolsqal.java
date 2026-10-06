package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqal {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
       // driver.navigate().to("https://demoqa.com/automation-practice-form");
		//Thread.sleep(8000);
		//driver.findElement(By.id("firstName")).sendKeys("Yamyny");
		//driver.findElement(By.id("lastName")).sendKeys("V");
		//driver.findElement(By.id("userNumber")).sendKeys("0134652789");
		//driver.findElement(By.id("dateOfbirth")).sendKeys("21 Aug 2005");
		//driver.findElement(By.id("subjectsInput")).sendKeys("abcd");
		//driver.findElement(By.id("userEmail")).sendKeys("abad@gmail.com");	
		//driver.findElement(By.id("currentAddress")).sendKeys("abadfdhf");	
        driver.get("https://www.amazon.in");
        driver.findElement(By.partialLinkText("Today's")).click();
     // Using findElements()

       // driver.get("https://demoqa.com/automation-practice-form");
        //Thread.sleep(4000);

       // List<WebElement> tf = driver.findElements(By.name("gender"));
        tf.get(0).click();
        
		
		
		
		
		
	}

}
