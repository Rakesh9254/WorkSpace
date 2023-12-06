package TestNGFramework.TestNGFramework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
    @DataProvider(name = "SearchDataSet")
    public Object[][] SearchData() {
        Object[][] SearchKeyword = new Object[3][2];
        SearchKeyword[0][0] = "India";
        SearchKeyword[0][1] = "Qutab Minar";

        SearchKeyword[1][0] = "Agra";
        SearchKeyword[1][1] = "Taj Mahal";

        SearchKeyword[2][0] = "Hyderabad";
        SearchKeyword[2][1] = "Char Minar";
        
        return SearchKeyword; // Added the return statement
    }

    @Test(dataProvider = "SearchDataSet")
    public void GoogleSearchDemo(String country, String monument) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement SearchBox = driver.findElement(By.name("q"));
        SearchBox.sendKeys(country + " " + monument);
        driver.findElement(By.name("btnK")).submit();
        
        driver.quit(); // Close the WebDriver session
    }
}
