package CodeStudio1;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        // Create a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open the URL of the registration page
        driver.get("https://www.opencart.com/index.php?route=account/register");

        // Find the dropdown element by its id
        WebElement element = driver.findElement(By.id("input-country"));

        // Create a Select object using the dropdown element
        Select dropDown = new Select(element);

        // Select an option from the dropdown by index (0-based)
        dropDown.selectByIndex(1);

        // Additional options to select an option by value or visible text
        // dropDown.selectByValue("96");
        // dropDown.selectByVisibleText("Hong kong");

        // Minimize the browser window (optional)
        driver.manage().window().minimize();

        // Quit the WebDriver instance, closing the browser
        driver.quit();
    }
}
