package HeadlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadLessTesting {

	public static void main(String[] args) throws Throwable {

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("After Search Title  : " + driver.getTitle());

		WebElement SearchTextFiled = driver.findElement(By.name("q"));
		SearchTextFiled.sendKeys("India Gate ");

		SearchTextFiled.sendKeys(Keys.ENTER);
		System.out.println("Before Search Title : " + driver.getTitle());

		Thread.sleep(3000);
		driver.quit();

	}

}
