
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenIncognitoMode {
	public static void main(String[] args) {

		// Create ChromeOptions to enable incognito mode
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		// Initialize the ChromeDriver with the ChromeOptions
		WebDriver driver = new ChromeDriver(options);

		// Navigate to a website
		driver.get("https://www.google.com/");

		// You can perform further actions in incognito mode here

		// Close the browser when done
		driver.quit();
	}
}
