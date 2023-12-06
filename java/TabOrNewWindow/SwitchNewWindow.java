package TabOrNewWindow;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchNewWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Google Title is :" + driver.getTitle());

		// Open a new tab and switch to it
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		System.out.println("FaceBook Title is: " + driver.getTitle());

		// Get window handles and store them in a list
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> handleList = new ArrayList<>(windowHandles);
        //closed secend page
		driver.close();
		// Switch back to the original tab or window (index 0)
		driver.switchTo().window(handleList.get(0));
		
		System.out.println("Google Title is: " + driver.getTitle());

		// Minimize the window
		driver.manage().window().minimize();

		// Quit the WebDriver
		driver.quit();
	}
}
