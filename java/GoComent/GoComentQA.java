package GoComent;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoComentQA {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		// Setup WebDriver before each test method
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://app.jazz.co/app/v2/login");
	}

	@Test
	public void fillOutAndSubmitForm() {
		WebElement createNewAc = driver
				.findElement(By.xpath("//li[text()=\"Don't have an account? \"]/..//a[text()='Start a Free Trial']"));
		createNewAc.click();

		WebElement firstNameTextField = driver.findElement(By.id("FirstName"));
		firstNameTextField.sendKeys("Rakesh");

		WebElement lastNameTextField = driver.findElement(By.id("LastName"));
		lastNameTextField.sendKeys("Roshan");

		WebElement companyTextField = driver.findElement(By.id("Company"));
		companyTextField.sendKeys("Gocoment");

		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.sendKeys("rakeshkumarroshan62@gmail.com");

		WebElement PhoneTextField = driver.findElement(By.id("Phone"));
		PhoneTextField.sendKeys("7631744096");

		WebElement selectHrisfield = driver.findElement(By.id("HRIS__c"));
		Select select = new Select(selectHrisfield);
		select.selectByVisibleText("ADP");

		WebElement selectHearfield = driver.findElement(By.id("How_did_you_hear_about_us__c"));
		Select scSelect = new Select(selectHearfield);
		scSelect.selectByVisibleText("Online Search");

		WebElement SubmitTextFiled = driver.findElement(By.className("mktoButton"));
		SubmitTextFiled.click();
	}
	@AfterMethod
	public void tearDown() {
		// Cleanup after each test method
		driver.quit();
	}
}
