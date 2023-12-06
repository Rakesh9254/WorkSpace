package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Actions actions = new Actions(driver);
		
		

		// username
//		WebElement usernameTextField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
//		usernameTextField.sendKeys("Admin");

		// Pwd
//		WebElement pwdTextField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//		pwdTextField.sendKeys("admin123");

//		WebElement sbtButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
//		sbtButton.click();

		driver.quit();

	}

}
