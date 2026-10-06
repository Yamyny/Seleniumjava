package WebElementsMethods;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement psw = driver.findElement(By.name("pass"));
		psw.sendKeys("ghghsghs");

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement email = wait.until(
		    ExpectedConditions.visibilityOfElementLocated(By.id("email"))
		);

		email.sendKeys("your_email@gmail.com");
		
	}

}
