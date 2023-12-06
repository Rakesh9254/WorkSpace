package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingDemo {

    WebDriver driver;

    @BeforeMethod
    @Parameters("Browser")
    public void LaunchBrowser(String Browser) {
        switch (Browser.toLowerCase()) {
            case "chrome":

                driver = new ChromeDriver();
                break;

            case "safari":
                driver = new SafariDriver();
                break;

            default:
                throw new IllegalArgumentException("Invalid browser specified: " + Browser);
        }
    }

    @Test
    public void VerifyTitle() {
        driver.get("https://www.google.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @AfterMethod
    public void Quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
