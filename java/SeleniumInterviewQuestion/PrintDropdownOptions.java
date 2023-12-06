package SeleniumInterviewQuestion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class PrintDropdownOptions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://pgportal.gov.in/Registration");

        // Click the drop down element to open it
        WebElement dropdownElement = driver.findElement(By.id("select2-country-container"));
        dropdownElement.click();
        WebElement element = driver.findElement(By.cssSelector(".select2-results__option"));

        // Find all the options within the drop down
        List<WebElement> optionElements = driver.findElements(By.cssSelector(".select2-results__option"));

        // Print each option
        for (WebElement option : optionElements) {
            System.out.println("Option: " + option.getText());
            
        }

        driver.quit();
    }
}
