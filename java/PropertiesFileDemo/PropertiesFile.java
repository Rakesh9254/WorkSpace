package PropertiesFileDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement UserNameTextFiled = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		UserNameTextFiled.sendKeys("Admin");
		WebElement PasswordTextFiled = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		PasswordTextFiled.sendKeys("admin123");
		WebElement LoginButton = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		LoginButton.click();

	}

}
