package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithoutPOM {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		// find & enter username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// find & enter the password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// find & click button
		driver.findElement(By.id("login-button")).click();
		
		driver.manage().window().minimize();
		driver.quit();

	}

}
