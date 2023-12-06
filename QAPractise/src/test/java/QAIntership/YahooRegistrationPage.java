package QAIntership;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YahooRegistrationPage {
	private WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get(
				"https://login.yahoo.com/account/create?.intl=in&specId=yidregsimplified&done=https%3A%2F%2Fwww.yahoo.com");
	}

	@Test(priority = 1)
	public void AccountCreateForm() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement firstname = driver.findElement(By.id("usernamereg-firstName"));
		firstname.sendKeys("Rakesh");
		WebElement lastnam = driver.findElement(By.id("usernamereg-lastName"));
		lastnam.sendKeys("Roshan");

		WebElement emailtext = driver.findElement(By.name("userId"));
		emailtext.sendKeys("Rakesh999344");

		WebElement passwordtext = driver.findElement(By.id("usernamereg-password"));
		passwordtext.sendKeys("Purnea@9254");

		WebElement birthMonthTextField = driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
        Select select = new Select(birthMonthTextField);
        Thread.sleep(3000);
        
        select.selectByIndex(8);
        Thread.sleep(3000);
		WebElement BirthtextDay = driver.findElement(By.id("usernamereg-day"));
		BirthtextDay.sendKeys("16");
		Thread.sleep(3000);
		WebElement BirthtextYear = driver.findElement(By.id("usernamereg-year"));
		BirthtextYear.sendKeys("1998");
		Thread.sleep(3000);
		WebElement SubmitButtom = driver.findElement(By.id("reg-submit-button"));
		SubmitButtom.click();
		String actualTitle = driver.getTitle();
		String ExpectTitle = "Yahoo";

		Assert.assertEquals(actualTitle, ExpectTitle, "Test B failed");

	}

	@Test(priority = 2, dependsOnMethods = "AccountCreateForm")
	public void LongMobileNo() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement phoneNumberField = driver.findElement(By.id("usernamereg-phone"));
        phoneNumberField.clear();
        phoneNumberField.sendKeys("12345678901234567890"); // More than 10 digits

        // Submit the form
        WebElement submitButton = driver.findElement(By.id("reg-submit-button"));
        submitButton.click();

        // Verify if there is an error message displayed for phone number length
        String actualPhoneNumberError = driver.findElement(By.id("reg-error-phone")).getText();
        String expectedPhoneNumberMessage = "This is too long.";

        // Capture the result of this test case
        Assert.assertEquals(actualPhoneNumberError, expectedPhoneNumberMessage, "Test B is Failed");

	}

	@Test(priority = 3, dependsOnMethods = "LongMobileNo")
	public void ValidMobile() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement PhoneTextField = driver.findElement(By.id("usernamereg-phone"));
		PhoneTextField.clear();
		Thread.sleep(3000);
		PhoneTextField.sendKeys("7631744096");
		WebElement SubmitButtom = driver.findElement(By.id("reg-submit-button"));
		SubmitButtom.click();

	}

	@AfterTest
	public void Quit() {
		driver.quit();
	}

}
