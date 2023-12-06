package ToolQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/");
		
		//element
		WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]/div[1]"));
		element.click();
		
		//element click
		WebElement Elementclick = driver.findElement(By.xpath("//span[normalize-space()='Text Box']"));
		Elementclick.click();	
		
		//user name
		WebElement userName = driver.findElement(By.id("userName"));
		userName.sendKeys("Rakesh Roshan");
		
		//user Email TextField
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		userEmail.sendKeys("rakeshkumarroshan62@gmail.com");
		
		//currentAddress
		
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("Purnea");
		
		//permanentAddress
		
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		permanentAddress.sendKeys("Patna,Bihar");
		
		//submit
		
		WebElement submitbtn = driver.findElement(By.id("submit"));
		submitbtn.submit();
		
		
		
		driver.quit();

	}

}
