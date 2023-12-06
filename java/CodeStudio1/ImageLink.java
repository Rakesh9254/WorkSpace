package CodeStudio1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.opencart.com/");
		driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();

		if (driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case not Passed");
		}

		driver.quit();
	}

}
