package QA;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.deadlinkcity.com/");
        
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Total links on the webpage: " + linkList.size());
        
        int brokenLinkCount = 0;

        for (WebElement link : linkList) {
            String urlString = link.getAttribute("href");
            try {
                URL url = new URL(urlString);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();

                int responseCode = connection.getResponseCode();
                if (responseCode >= 400) {
                    System.out.println(url + " - Broken Link (Response Code: " + responseCode + ")");
                    brokenLinkCount++;
                }

                connection.disconnect();
            } catch (MalformedURLException e) {
                System.err.println("Malformed URL: " + urlString);
            } catch (IOException e) {
                System.err.println("IOException for URL: " + urlString);
            }
        }
        
        System.out.println("Total Broken Links: " + brokenLinkCount);

        driver.manage().window().minimize();
        driver.quit();
    }
}
