package CodeStudio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTips {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/tooltip/");

        // Explicit wait for the presence of the element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        try {
            WebElement tooltipElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("age")));

            // If found, retrieve the tooltip attribute
            String tooltip = tooltipElement.getAttribute("title");

            String expectedTooltip = "We ask for your age only for statistical purposes.";

            if (tooltip.equals(expectedTooltip)) {
                System.out.println("Test Passed.");
            } else {
                System.out.println("Test Failed.");
            }
        } catch (Exception e) {
            System.out.println("Element not found or Timeout occurred.");
        } finally {
            driver.quit();
        }
    }
}
