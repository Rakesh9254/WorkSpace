package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.*;

import net.bytebuddy.asm.Advice.This;

public class LoginPage2 {
	WebDriver driver;

	// constructor
	LoginPage2(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

	// identify by webelement

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "login-button")
	WebElement loginbutton;

	public void EnterUsername(String Usern) {
		username.sendKeys(Usern);
	}

	public void EnterPassword(String pwd) {
		Password.sendKeys(pwd);
	}

	public void ClickOnloginbtn() {
		loginbutton.click();
	}

}
