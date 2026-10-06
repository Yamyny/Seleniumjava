package com.Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EmptyBrowser {

	
	public static void main(String[] args) {
		// TODO Auto-generated method 
         WebDriver driver=new ChromeDriver();
         //get()
         driver.get("https://saucelabs.com");
       //get title()
         System.out.println(driver.getTitle());
        //get currentUrl()
         System.out.println(driver.getCurrentUrl());
         //getPageSource()
         System.out.println(driver.getPageSource());
         //getWindowHandle it is used to get unique id of browser window
         System.out.println(driver.getWindowHandle());
         
	}

}
