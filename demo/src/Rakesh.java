import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Rakesh {
    public static void main(String[] args) {
        WebDriver driver = new chromedriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        // Wait for 5 seconds before closing the browser
        driver.quit();
    }
}
