package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver=new FirefoxDriver();
	         //get()
	         driver.get("https://www.flipkart.com");
	       //get title()
	         System.out.println(driver.getTitle());
	        //get currentUrl()
	         System.out.println(driver.getCurrentUrl());
	         //getPageSource()
	         System.out.println(driver.getPageSource());
	}

}
