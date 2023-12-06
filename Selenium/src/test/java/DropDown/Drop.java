package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://pgportal.gov.in/Registration");
		WebElement dropElement=driver.findElement(By.id("country"));
		Select select = new Select(dropElement);
		select.selectByIndex(3);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
