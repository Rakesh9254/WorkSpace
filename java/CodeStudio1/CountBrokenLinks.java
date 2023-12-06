package CodeStudio1;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountBrokenLinks {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        int BrokenLinksCount = 0;
        System.out.println("Total Links On WebPage : " + linkList.size());

        for (WebElement element : linkList) {
            String url = element.getAttribute("href");

            try {
                if (url != null && !url.isEmpty()) {
                    URL urlLink = new URL(url);

                    HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
                    huc.setRequestMethod("HEAD");
                    huc.connect();

                    int resCode = huc.getResponseCode();
                    if (resCode >= 400) {
                        System.out.println(url + " - Broken Link. ");
                        BrokenLinksCount++;
                    }
                }
            } catch (MalformedURLException e) {
                System.err.println("Malformed URL: " + url);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total Broken Links: " + BrokenLinksCount);

        driver.quit();
    }
}
