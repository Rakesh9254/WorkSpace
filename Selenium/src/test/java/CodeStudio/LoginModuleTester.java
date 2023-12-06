package CodeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Scenario: you need to test only the login module 10 times & on the 11th time, you have to do login again to test some of the core features. How will you do?

public class LoginModuleTester {

    public static void main(String[] args) {

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Test the login module 10 times
        for (int i = 1; i <= 10; i++) {
            testLogin(driver, "username", "password");
            // Additional test steps related to the login functionality can be added here
            // For example: Assertions, validation checks, etc.
            System.out.println("Login test iteration " + i + " completed.");
            driver.navigate().to("https://yourwebsite.com/logout"); // Assuming a logout URL
        }

        // Perform login again to test core features on the 11th iteration
        testLogin(driver, "username", "password");
        // Perform additional testing for core features after login
        // For example: Navigate to specific pages, test functionalities, etc.

        // Close the browser
        driver.quit();
    }

    public static void testLogin(WebDriver driver, String username, String password) {
        // Navigate to the login page
        driver.get("https://www.facebook.com/"); // Replace with your login page URL

        // Locate login elements and perform login
        WebElement usernameField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));

        // Input username and password
        usernameField.sendKeys("rakeshkumarroshan62@gmail.com");
        passwordField.sendKeys("Roshan@9254");

        // Click on the login button
        loginButton.click();

        // Add assertions or validation checks here if needed
    }
}
