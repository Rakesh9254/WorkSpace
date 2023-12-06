package QA;

import java.util.List;

import org.apache.hc.client5.http.nio.ManagedAsyncClientConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButtom {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		List<WebElement> RadioButtonElements = driver.findElements(By.tagName("radio"));
		System.out.println("Total RadioButtom is : " + RadioButtonElements.size());
		
		
		driver.manage().window().minimize();
		driver.quit();

	}

}
