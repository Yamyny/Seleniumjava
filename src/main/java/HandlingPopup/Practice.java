package HandlingPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(4000);
		
		/*driver.findElement(By.id("name")).sendKeys("ABC");
		Thread.sleep(4000);

		driver.findElement(By.id("email")).sendKeys("ABC@gmail.com");
		Thread.sleep(4000);
             
		driver.findElement(By.id("phone")).sendKeys("0123456789");
		Thread.sleep(4000);
		
		driver.findElement(By.id("textarea")).sendKeys("agfdytfukkubyuyueytrbyo");
		Thread.sleep(4000);
	      
		driver.findElement(By.id("female")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("monday")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("wednesday")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("saturday")).click();
		Thread.sleep(4000);
		
		Select colors = new Select(driver.findElement(By.cssSelector("#colors")));

		colors.selectByValue("red");
		colors.selectByValue("blue");
		
		Select colors = new Select(driver.findElement(By.cssSelector("#animals")));

		colors.selectByValue("cat");
		colors.selectByValue("dog");*/
		
		
		// Date Picker 1
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='25']")).click();
		Thread.sleep(2000);


		// Date Picker 2
		driver.findElement(By.id("txtDate")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='25']")).click();
		Thread.sleep(2000);


		// Date Picker 3 - Date Range
		driver.findElement(By.id("start-date")).sendKeys("09/25/2026");
		Thread.sleep(2000);

		driver.findElement(By.id("end-date")).sendKeys("09/30/2026");
		Thread.sleep(2000);

		driver.findElement(By.id("calculateRange")).click();
		Thread.sleep(4000);
		
		WebElement upload = driver.findElement(By.id("singleFileInput"));

		upload.sendKeys("\"C:\\Users\\yamyn\\Downloads\\ChatGPT Image Sep 21, 2026, 09_35_24 AM.png\"");

		Thread.sleep(2000);

		WebElement file = driver.findElement(By.xpath("//button[text()='Upload Single File']"));

		file.click();

		Thread.sleep(3000);
		
		WebElement upload = driver.findElement(By.id("multipleFileInput"));

		upload.sendKeys("C:\\Users\\YourName\\Downloads\\file1.txt\n"
		             + "C:\\Users\\YourName\\Downloads\\file2.txt");

		Thread.sleep(2000);

		WebElement file = driver.findElement(
		    By.xpath("//button[text()='Upload Multiple Files']")
		);

		file.click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[text()='Smartphone']/following-sibling::td/input")).click();
		Thread.sleep(2000);
		
		WebElement start = driver.findElement(By.name("start"));

		start.click();

		Thread.sleep(4000);
		
		
	
	}

}
