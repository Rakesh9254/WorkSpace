package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		WithoutPageFactory pgFactory = new WithoutPageFactory(driver);
		
		driver.get("https://www.saucedemo.com/v1/index.html");
		pgFactory.EnterUsername("standard_user");
		pgFactory.EnterPassword("secret_sauce");
		pgFactory.Enterloginbtn();
		
		driver.quit();
	}

}
