import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.calculator.net/");
		
		List<WebElement> linksElements = driver.findElements(By.tagName("a"));
		System.out.println("Total Links on WebPage:" + linksElements);
		System.out.println("Total Links on WebPage :" + linksElements.size());	
		
		
		for(WebElement links : linksElements) {
			System.out.println(links.getText());
		}
		driver.quit();
	}

}
