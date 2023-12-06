package RahulShettyAcademy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators3 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement loginbtn=driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));
		System.out.println(loginbtn.getText());
		
		WebElement loginbtn1=driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]"));
		System.out.println(loginbtn1.getText());
		
		
		driver.quit();
		

	}

}
