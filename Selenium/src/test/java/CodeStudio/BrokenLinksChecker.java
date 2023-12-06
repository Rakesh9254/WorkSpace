package CodeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinksChecker {

    public static void main(String[] args) {

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("http://www.deadlinkcity.com/");

        // Find all the links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }

        // Close the browser
        driver.quit();
    }

    public static void verifyLink(String linkURL) {
        try {
            URL url = new URL(linkURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(3000); // Timeout 3 seconds for connection
            connection.connect();

            if (connection.getResponseCode() == 200) {
                System.out.println(linkURL + " - " + connection.getResponseMessage());
            } else {
                System.out.println(linkURL + " - " + connection.getResponseMessage() + " - " + connection.getResponseCode());
            }
            connection.disconnect();
        } catch (Exception e) {
            System.out.println(linkURL + " - " + e.getMessage());
        }
    }
}

