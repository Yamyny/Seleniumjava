package com.Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Jaypore {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.jaypore.com/");
     Thread.sleep(4000);
     
     //Checking Locate store navigation link
     
     /*driver.findElement(By.xpath("//a[@title='Locate Stores']")).click();
     Thread.sleep(4000);*/
     
     //Checking if the state and city is given does they show available stores 
     
     
     
	}

}
