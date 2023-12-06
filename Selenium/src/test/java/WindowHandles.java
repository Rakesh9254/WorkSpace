
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.className("blinkingText")).click();

		// Get the window handles
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		String parentWindowId = iterator.next();
		String childWindowId = iterator.next();

		// Switch to the child window
		driver.switchTo().window(childWindowId);

		// Perform actions in the child window
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		// Close the child window
		driver.close();

		// Switch back to the parent window
		driver.switchTo().window(parentWindowId);

		// Post condition
		driver.manage().window().minimize();
		driver.quit();
	}
}
