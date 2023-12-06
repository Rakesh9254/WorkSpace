package Oct2023UsingByActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodUsingCapitalLetter {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/ref=nav_logo");
		Actions actions = new Actions(driver);
		WebElement SearchTextField = driver.findElement(By.id("twotabsearchtextbox"));
		actions.moveToElement(SearchTextField).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
		
		Thread.sleep(4000);
		

		// post condation
		driver.manage().window().minimize();
		driver.quit();

	}

}
