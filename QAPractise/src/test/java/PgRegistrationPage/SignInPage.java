package PgRegistrationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInPage {

    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Use WebDriverWait for waiting for elements
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("https://pgportal.gov.in/Registration");
        WebElement nameTextField = driver.findElement(By.id("Name"));
        nameTextField.sendKeys("Rakesh Roshan");

        // Find and click the checkbox div
        WebElement checkboxDiv = driver.findElement(By.xpath("//div[@class='col-12 col-md-12']//div[@class='row']//div[1]//div[1]"));
        checkboxDiv.click();

        WebElement addressElement1 = driver.findElement(By.id("Address1"));
        addressElement1.sendKeys("BIRANCHIYA");

        WebElement addressElement2 = driver.findElement(By.id("Address2"));
        addressElement2.sendKeys("BANMANKHI");

        WebElement addressElement3 = driver.findElement(By.id("Address3"));
        addressElement3.sendKeys("PURNEA");

        // Select country
        WebElement countryElement = driver.findElement(By.id("select2-country-container"));
        countryElement.click();
        WebElement countrySearchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='select2-search__field']")));
        countrySearchField.sendKeys("India");
        countrySearchField.sendKeys(Keys.RETURN);

        // Select state
        WebElement stateElement = driver.findElement(By.id("select2-state-container"));
        stateElement.click();
        WebElement stateSearchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='select2-search__field']")));
        stateSearchField.sendKeys("Bihar");
        stateSearchField.sendKeys(Keys.RETURN);

        // Select district
        WebElement districtElement = driver.findElement(By.id("select2-district-container"));
        districtElement.click();
        WebElement districtSearchField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-conrols='select2-district-results']")));
        districtSearchField.sendKeys("Purnea");
        districtSearchField.sendKeys(Keys.RETURN);

        WebElement pinCodeTextElement = driver.findElement(By.id("Pincode"));
        pinCodeTextElement.sendKeys("854202");

        Thread.sleep(3000);

        driver.quit();
    }
}
