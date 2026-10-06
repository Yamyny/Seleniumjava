package com.Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.amazon.in/");
		// driver.manage().window().maximize();
		 //driver.manage().window().minimize();
		 //driver.manage().window().fullscreen();
		 //getSize
		// Dimension size=driver.manage().window().getSize();
		// System.out.println("Width"+size.getWidth());
		// System.out.println("Height"+size.getHeight());
		 
		 //setSize
		 //driver.manage().window.getSize(new Dimension(800,600));
		 
		 //getPosition
		// Point p=driver.manage().window.getPostion();
		 //System.out.println("X coordinate"+p.getX());
		 //System.out.println("Y coordinate"+p.getY());	 
		 
		 //setPosition
		 driver.manage().window.setPosition(new Point(100,200));
		 
		 
		 
		 
	}

}
