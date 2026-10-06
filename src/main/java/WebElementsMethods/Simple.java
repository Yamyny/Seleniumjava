package WebElementsMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Simple {


		public static void main(String[] args) throws InterruptedException {

		    // MOUSE HOVER
		   /* WebDriver driver = new ChromeDriver();

		    driver.get("https://www.amazon.in/");

		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		    Actions act = new Actions(driver);

		    Thread.sleep(4000);

		    WebElement b = driver.findElement(
		        By.xpath("//span[text()='YOUR_TEXT']")
		    );

		    act.moveToElement(b).build().perform();*/


		  //RIGHT CLICK
		   /* WebDriver driver = new ChromeDriver();

		    driver.get("https://demoqa.com/buttons");

		    Thread.sleep(4000);

		    Actions act = new Actions(driver);

		    WebElement rc = driver.findElement(By.id("rightClickBtn"));

		    act.contextClick(rc).build().perform();*/
			
			
			
		}
	

}
