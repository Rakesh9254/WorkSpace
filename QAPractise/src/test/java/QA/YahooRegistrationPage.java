package QA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooRegistrationPage {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
    }

    @Test(priority = 1)
    public void testRegistrationWithAllRequiredFields() throws Throwable {
    	
        //registration form fields with valid data
        WebElement firstNameField = driver.findElement(By.id("usernamereg-firstName"));
        firstNameField.sendKeys("Rakesh");
        WebElement lastNameTextField = driver.findElement(By.id("usernamereg-lastName"));
        lastNameTextField.sendKeys("Roshan");
        WebElement emailTextField = driver.findElement(By.name("userId"));
        emailTextField.sendKeys("Rakesh92541");
        WebElement passwordTextField = driver.findElement(By.id("usernamereg-password"));
        passwordTextField.sendKeys("Purnea@9254");

        // Select birth month
        WebElement birthMonthTextField = driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
        Select select = new Select(birthMonthTextField);
        select.selectByVisibleText("August");

        WebElement birthDayTextField = driver.findElement(By.id("usernamereg-day"));
        birthDayTextField.sendKeys("16");
        WebElement birthYearTextField = driver.findElement(By.name("yyyy"));
        birthYearTextField.sendKeys("1998");

        // Submit button
        WebElement submitButton = driver.findElement(By.id("reg-submit-button"));
        submitButton.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Yahoo";

        Assert.assertEquals(actualTitle, expectedTitle, "Test A is Failed");
    }

    @Test(priority = 2, dependsOnMethods = "testRegistrationWithAllRequiredFields")
    public void testPhoneNumberLengthValidation() throws Throwable {
//       more than 10 digits
        WebElement phoneNumberField = driver.findElement(By.id("usernamereg-phone"));
        phoneNumberField.clear();
        phoneNumberField.sendKeys("12345678901234567890"); // More than 10 digits
        Thread.sleep(3000);

        
        WebElement submitButton = driver.findElement(By.id("reg-submit-button"));
        submitButton.click();

        // Error message displayed for phone number length
        String actualPhoneNumberError = driver.findElement(By.id("reg-error-phone")).getText();
        String expectedPhoneNumberMessage = "This is too long.";

        
        Assert.assertEquals(actualPhoneNumberError, expectedPhoneNumberMessage, "Test B is Failed");
    }
    @Test(priority = 3, dependsOnMethods = "testPhoneNumberLengthValidation")
    public void ValidMobile() {
    	WebElement phoneNumberField = driver.findElement(By.id("usernamereg-phone"));
        phoneNumberField.clear();
        phoneNumberField.sendKeys("7631744096");
        WebElement submitButton = driver.findElement(By.id("reg-submit-button"));
        submitButton.click();
	}

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}