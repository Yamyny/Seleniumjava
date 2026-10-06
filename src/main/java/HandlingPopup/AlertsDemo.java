package HandlingPopup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

		public class AlertsDemo {

		    public static void main(String[] args) throws InterruptedException {

		        WebDriver driver = new ChromeDriver();

		        driver.get("https://demoqa.com/alerts");

		        Thread.sleep(4000);

		       /*
		         // Simple alert
		        driver.findElement(By.id("alertButton")).click();

		        Alert a = driver.switchTo().alert();

		        Thread.sleep(4000);

		        a.accept();
		        
		      // Confirmation alert
              driver.findElement(By.id("confirmButton")).click();

               Alert b = driver.switchTo().alert();

               Thread.sleep(2000);

              // Dismiss the confirmation alert
              b.dismiss();


               // Prompt alert
                   driver.findElement(By.id("promtButton")).click();

                    Alert c = driver.switchTo().alert();

                  Thread.sleep(2000);

               // Enter text in prompt
                 c.sendKeys("Yamyny");

               // Accept the prompt
                  c.accept();

                driver.quit();*/
		    }
		}
	
