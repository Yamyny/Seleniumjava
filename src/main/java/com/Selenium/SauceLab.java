package com.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.saucedemo.com/");
      Thread.sleep(4000);
    
      //Valid login with standard user and password.
      
      /*driver.findElement(By.id("user-name")).sendKeys("standard_user");
     Thread.sleep(4000);
     driver.findElement(By.id("password")).sendKeys("secret_sauce");
     Thread.sleep(4000);
     driver.findElement(By.id("login-button")).click();
     Thread.sleep(4000);*/
     
     //Login with locked out user and password.
     
     /*driver.findElement(By.id("user-name")).sendKeys("locked_out_user ");
     Thread.sleep(4000);
     driver.findElement(By.id("password")).sendKeys("secret_sauce");
     Thread.sleep(4000);
     driver.findElement(By.id("login-button")).click();
     Thread.sleep(4000);*/
      
      //Login with empty username and password.
      
      /*driver.findElement(By.id("user-name")).sendKeys("");
      Thread.sleep(4000);
      driver.findElement(By.id("password")).sendKeys("");
      Thread.sleep(4000);
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(4000);*/
      
      //Valid login with problem username and password.
      
      /*driver.findElement(By.id("user-name")).sendKeys("problem_user");
      Thread.sleep(4000);
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      Thread.sleep(4000);
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(4000);*/
      
      //Login with invalid password
      
      /*driver.findElement(By.id("user-name")).sendKeys("standard_user");
      Thread.sleep(4000);
      driver.findElement(By.id("password")).sendKeys("012345");
      Thread.sleep(4000);
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(4000);*/
      
      //Login without password.
      
      /*driver.findElement(By.id("user-name")).sendKeys("standard_user");
      Thread.sleep(4000);
      driver.findElement(By.id("password")).sendKeys("");
      Thread.sleep(4000);
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(4000);*/
      
      //Login without username and a valid password.
     
      /*driver.findElement(By.id("user-name")).sendKeys("");
      Thread.sleep(4000);
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      Thread.sleep(4000);
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(4000);*/
      
     
      //Login without username and a invalid password.
      
      /*driver.findElement(By.id("user-name")).sendKeys("");
      Thread.sleep(4000);
      driver.findElement(By.id("password")).sendKeys("012345");
      Thread.sleep(4000);
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(4000);*/
      
      //Login with performance glitch user and its password.
      
      /*driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
      Thread.sleep(4000);
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      Thread.sleep(4000);
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(4000);*/
      
      //Login with error_user and its password.
      
      /*driver.findElement(By.id("user-name")).sendKeys("error_user");
      Thread.sleep(4000);
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      Thread.sleep(4000);
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(4000);*/
      
      //Login with visual_user and its password.
      /*driver.findElement(By.id("user-name")).sendKeys("visual_user");
      Thread.sleep(4000);
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
      Thread.sleep(4000);
      driver.findElement(By.id("login-button")).click();
      Thread.sleep(4000);*/
      
		//Sort products by Name (A to Z).

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		Select sortDropdown = new Select(driver.findElement(By.className("product_sort_container")));
		sortDropdown.selectByValue("az");
		Thread.sleep(4000);*/

		//Sort products by Name (Z to A).

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		Select sortDropdown = new Select(driver.findElement(By.className("product_sort_container")));
		sortDropdown.selectByValue("za");
		Thread.sleep(4000);*/

		//Sort products by Price (low to high).

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		Select sortDropdown = new Select(driver.findElement(By.className("product_sort_container")));
		sortDropdown.selectByValue("lohi");
		Thread.sleep(4000);*/

		//Sort products by Price (high to low).

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		Select sortDropdown = new Select(driver.findElement(By.className("product_sort_container")));
		sortDropdown.selectByValue("hilo");
		Thread.sleep(4000);*/

		//View product details page.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		Thread.sleep(4000);*/

		//Add a single product to cart.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);*/

		//Add multiple products to cart.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		Thread.sleep(4000);*/

		//Remove product from cart via products page.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(4000);*/

		//Remove product from cart via cart page.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		Thread.sleep(4000);*/

		//Verify cart page displays correct item details.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);*/

		//Continue Shopping button navigates back to products page.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("continue-shopping")).click();
		Thread.sleep(4000);*/

		//Checkout with valid information.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("first-name")).sendKeys("Yamyny");
		Thread.sleep(4000);
		driver.findElement(By.id("last-name")).sendKeys("PT");
		Thread.sleep(4000);
		driver.findElement(By.id("postal-code")).sendKeys("680684");
		Thread.sleep(4000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(4000);*/

		//Checkout with missing first name.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("last-name")).sendKeys("PT");
		Thread.sleep(4000);
		driver.findElement(By.id("postal-code")).sendKeys("680684");
		Thread.sleep(4000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4000);*/

		//Checkout with missing last name.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("first-name")).sendKeys("Yamyny");
		Thread.sleep(4000);
		driver.findElement(By.id("postal-code")).sendKeys("680684");
		Thread.sleep(4000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4000);*/

		//Checkout with missing zip/postal code.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("first-name")).sendKeys("Yamyny");
		Thread.sleep(4000);
		driver.findElement(By.id("last-name")).sendKeys("PT");
		Thread.sleep(4000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4000);*/

		//Cancel checkout from information page.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cancel")).click();
		Thread.sleep(4000);*/

		//Cancel checkout from overview page.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("first-name")).sendKeys("Yamyny");
		Thread.sleep(4000);
		driver.findElement(By.id("last-name")).sendKeys("PT");
		Thread.sleep(4000);
		driver.findElement(By.id("postal-code")).sendKeys("680684");
		Thread.sleep(4000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cancel")).click();
		Thread.sleep(4000);*/

		//Verify order summary totals on checkout overview page.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(4000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("first-name")).sendKeys("Yamyny");
		Thread.sleep(4000);
		driver.findElement(By.id("last-name")).sendKeys("PT");
		Thread.sleep(4000);
		driver.findElement(By.id("postal-code")).sendKeys("680684");
		Thread.sleep(4000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4000);*/

		//Logout via hamburger menu.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(4000);*/

		//Verify session ends after logout.

		/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(4000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(4000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);*/
      
	}

}
