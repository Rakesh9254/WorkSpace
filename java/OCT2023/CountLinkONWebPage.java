package OCT2023;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinkONWebPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		
		List<WebElement> linkElements =driver.findElements(By.tagName("a"));
		System.out.println(linkElements.size());
		
		
		for(WebElement x1 : linkElements) {
			System.out.println(x1.getAttribute("href"));
		}
		driver.quit();
		

	}

}
