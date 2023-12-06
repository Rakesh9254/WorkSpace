package CodeBySelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SecondProgram {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://pgportal.gov.in/");
		WebElement signbtn = driver.findElement(By.xpath("//a[@class='btn btn-signIn']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(signbtn).click().perform();
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
