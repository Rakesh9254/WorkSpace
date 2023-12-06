import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLab {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		WebElement UsernameText = driver.findElement(By.id("user-name"));
		UsernameText.sendKeys("standard_user");

		WebElement passtext = driver.findElement(By.id("password"));
		passtext.sendKeys("secret_sauce");
		WebElement loginbtnElement = driver.findElement(By.id("login-button"));
		loginbtnElement.click();

		WebElement addtocartElement = driver
				.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
		addtocartElement.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement addtocart2 = driver.findElement(
				By.xpath("(//button[@class='btn_primary btn_inventory'][normalize-space()='ADD TO CART'])[6]"));
		addtocart2.click();
		Thread.sleep(3000);
		driver.quit();

	}

}
