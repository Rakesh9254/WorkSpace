package RahulShettyAcademy;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TimeoutException;

public class DropDown1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Set an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.spicejet.com/");
        
        try {
            // Check if the "Family & Friends" link is enabled
            System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).isSelected());
            
            // Click on the "Family & Friends" link
            driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
            
            // Check if the link is still enabled (if the page changes)
            System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).isEnabled());
        } catch (TimeoutException e) {
            // Handle the exception if the element is not found within the specified time
            System.out.println("Element not found within the timeout");
        } finally {
            // Close the WebDriver
            driver.quit();
        }
    }
}
