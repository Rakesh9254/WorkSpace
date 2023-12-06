package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	// constructor
	LoginPage(WebDriver d) {
		driver = d;
	}

	By username = By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.id("login-button");

	public void EnterUsername(String usern) {
		driver.findElement(username).sendKeys(usern);
	}

	public void EnterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void Clickonloginbtn() {
		driver.findElement(loginbtn).click();
	}

}
