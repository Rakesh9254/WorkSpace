package TestNGFramework.TestNGFramework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTesting {
	WebDriver driver;
	@Test
	public void VerityTitle() {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		WebElement Title = driver.findElement(By.xpath("//title[contains(text(),'Online Shopping site in India: Shop Online for Mob')]"));
		 String Title1 =Title.getText();
		 
		 AssertJUnit.assertEquals(Title1, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		driver.quit();
	}
	@Test
	public void VerityLog() {
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		WebElement Logo = driver.findElement(By.id("logo-ext"));
		String logoq=Logo.getText();
		 
		 
		 AssertJUnit.assertEquals(logoq, "logo-ext");
		driver.quit();
	}

}
