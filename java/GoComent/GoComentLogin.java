package GoComent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoComentLogin {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://app.jazz.co/app/v2/login");
		WebElement emailInput = driver.findElement(By.id("email"));
		emailInput.sendKeys(Keys.chord("rakeshkumarroshan62@gmail.com"));
		Thread.sleep(3000);
		WebElement pwdInput = driver.findElement(By.id("password"));
		pwdInput.sendKeys(Keys.chord("Rakesh@9254"));
		
		WebElement catchElement = driver.findElement(By.xpath("//div/span[@role='checkbox']"));
		catchElement.click();
		

		driver.manage().window().minimize();
		driver.quit();

	}

}
