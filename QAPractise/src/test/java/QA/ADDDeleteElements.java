package QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ADDDeleteElements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement element1 = driver.findElement(By.xpath("//a[@href='/add_remove_elements/']"));
		element1.click();
		WebElement element2 = driver.findElement(By.xpath("//button[normalize-space()='Add Element']"));
		element2.click();
		
		
		Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.xpath("//div[@id='content']"));
		
		element3.click();
		
		Thread.sleep(3000);
		
		
		driver.manage().window().minimize();
		driver.quit();

	}

}
