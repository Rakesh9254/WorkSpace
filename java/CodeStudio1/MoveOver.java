package CodeStudio1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveOver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		WebElement element = driver.findElement(By.linkText("Health & Beauty"));

		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();



		driver.quit();

	}

}
