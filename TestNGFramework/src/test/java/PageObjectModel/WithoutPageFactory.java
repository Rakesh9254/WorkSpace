package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithoutPageFactory {
	WebDriver driver;
	
	//constructor
	WithoutPageFactory(WebDriver d){
		driver = d;
	}
	By username = By.id("username");
	By password = By.id("password");
	By loginbtn = By.id("login-button");
	
	public void EnterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void EnterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void Enterloginbtn() {
		driver.findElement(loginbtn).click();
	}

}
