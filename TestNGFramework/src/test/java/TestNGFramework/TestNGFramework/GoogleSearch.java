package TestNGFramework.TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch {

    @Test
    @Parameters("SearchData")
    public void googlesearch(String SearchData) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement SearchBox = driver.findElement(By.name("q"));
        SearchBox.sendKeys(SearchData);
        driver.findElement(By.name("btnK")).click();

        String currentValue = SearchBox.getAttribute("value");
        Assert.assertEquals(currentValue, SearchBox);
        
        driver.quit();
    }
}
