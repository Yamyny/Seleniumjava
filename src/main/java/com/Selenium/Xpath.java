package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		        // XPATH
		WebDriver driver = new ChromeDriver();

        //driver.get("https://www.saucedemo.com/");
        //Thread.sleep(4000);

        //driver.findElement(By.xpath("//input[@id='user-name']"))
          //      .sendKeys("problem_user");

        //driver.findElement(By.xpath("//input[@id='password']"))
          //      .sendKeys("secret_sauce");

        //driver.findElement(By.xpath("//input[@id='login-button']"))
         //       .click();

        // TEXT FUNCTION

     //  driver.findElement(By.xpath("//button[text()='Add to cart'][1]"))
       //         .click();

        //driver.findElement(By.xpath("//button[text()='Add to cart'][2]"))
         //.click();
		
		// XPATH BY CONTAINS FUNCTION
		driver.get("https://www.automationexercise.com/");
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("//a[contains(text(),'Signup ')]")).click();
		//driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("Tops");
		


		    }
		
	}


