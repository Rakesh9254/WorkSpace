package TabOrNewWindow;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchNewWindow1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Google Title is: " + driver.getTitle());

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		System.out.println("Facebook Title is:" + driver.getTitle());

		Set<String> windowHandleSet = driver.getWindowHandles();
		ArrayList<String> handleStrings = new ArrayList<>(windowHandleSet);

		driver.close();
		driver.switchTo().window(handleStrings.get(0));
		
		driver.manage().window().minimize();
		driver.quit();

	}

}
