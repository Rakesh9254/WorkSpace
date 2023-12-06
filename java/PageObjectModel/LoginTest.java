package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		LoginPage2 loginPage = new LoginPage2(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		loginPage.EnterUsername("standard_user");
		
		loginPage.EnterPassword("secret_sauce");
		
		loginPage.ClickOnloginbtn();

	}

}
