package WebElementInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyValueAttribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		String usernameTextValue = usernameTextField.getAttribute("value");
		if (usernameTextValue.isEmpty()) {
			System.out.println("The text Field is Empty");
			usernameTextField.sendKeys("Qspider");

		} else {
			System.out.println("The text field is not Empty");
			usernameTextField.clear();
			usernameTextField.sendKeys("Jspider");

		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
