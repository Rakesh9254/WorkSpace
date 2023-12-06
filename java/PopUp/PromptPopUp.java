package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {

    public static void main(String[] args) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

        // Find and click on the "Prompt" button
        driver.findElement(By.xpath("//input[@value='Prompt']")).click();

        // Wait for the alert to appear
        Thread.sleep(2000);

        // Switch to the alert
        Alert promptAlert = driver.switchTo().alert();

        // Send text to the prompt input
        promptAlert.sendKeys("Rakesh");

        // Accept the prompt
        promptAlert.accept();

        // Wait for a brief moment to see the result
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }

}
