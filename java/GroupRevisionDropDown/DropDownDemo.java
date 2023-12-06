package GroupRevisionDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://pgportal.gov.in/Registration");

        WebElement countryDropdown = driver.findElement(By.id("select2-country-container"));
        
        
        
        
        Select select = new Select(countryDropdown);
        List<WebElement> optionsList = select.getOptions();
        for(WebElement optionsList1 : optionsList) {
        	System.out.println(optionsList1.getText());
        }
        
        
//        Actions actions = new Actions(driver);
//        actions.click(countryDropdown).perform();
//        
//        WebElement countryOption = driver.findElement(By.xpath("//ul[@id='select2-country-results']/li[7]"));
//        actions.click(countryOption).perform();
        
      
        
        

        Thread.sleep(2000);
        driver.quit();
    }
}
