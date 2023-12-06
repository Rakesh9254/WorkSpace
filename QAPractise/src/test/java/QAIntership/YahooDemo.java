package QAIntership;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooDemo {

    public static void main(String[] args) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.yahoo.com/account/create?.intl=us&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com");
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

        // Submit the form
        WebElement submitButton = driver.findElement(By.id("reg-submit-button"));
        submitButton.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Yahoo";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test A passed");
        } else {
            System.out.println("Test A Failed");
        }

        WebElement phoneNumberField = driver.findElement(By.id("usernamereg-phone"));
        phoneNumberField.clear();

        String phoneNumber = "12345678901234567890"; // Change to valid or invalid number as needed
        phoneNumberField.sendKeys(phoneNumber);

        WebElement submitButton1 = driver.findElement(By.id("reg-submit-button"));
        submitButton1.click();

        // Capture the error message after clicking the submit button for the phone number field
        String actualPhoneNumberError = driver.findElement(By.id("reg-error-phone")).getText();
        String expectedPhoneNumberMessage = "This is too long.";

        if (actualPhoneNumberError.equals(expectedPhoneNumberMessage)) {
            System.out.println("Test B Passed");
        } else {
            System.out.println("Test B failed");
        }

        // Close the browser
        driver.quit();
    }
}
