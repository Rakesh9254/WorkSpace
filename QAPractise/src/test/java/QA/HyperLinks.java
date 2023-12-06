package QA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
		System.out.println("Total Links On webpage is: " + linkElements.size());

		for (WebElement e1 : linkElements) {
			System.out.println(e1.getText());
		}

		driver.manage().window().minimize();
		driver.quit();

	}

}
