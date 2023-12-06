package RahulShettyAcademy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest1 {

    public static void main(String[] args) throws IOException {
        // Set the path to the Excel file
        String excelFilePath = "TestData.xlsx";

        // Create a FileInputStream to read the Excel file
        FileInputStream inputStream = new FileInputStream("/Users/rakesh9254/Desktop/TestData.xlsx");

        // Create a workbook from the Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // Get the desired sheet from the workbook (e.g., "Sheet1")
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        // Set up Chrome WebDriver
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        // Loop through rows in the Excel sheet (starting from row 1)
        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
            // Set up a new WebDriver instance for each iteration
            WebDriver driver = new ChromeDriver(options);

            Row row = sheet.getRow(rowNum);

            // Get data from Excel columns (assuming column 0 is username and column 1 is password)
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();

            // Your Selenium test steps go here
            driver.get("https://tattvabooking.abhosting.co.in/login");
            WebElement emailTextField = driver.findElement(By.id("username"));
            WebElement pwdTextField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.cssSelector("button.btn.btn-success.pull-right"));

            emailTextField.sendKeys(username);
            pwdTextField.sendKeys(password);
            loginButton.click();

            // Wait for a specific element or condition (e.g., a welcome message)
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcomeMessage")));

            // Add assertions to validate the test
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.equals("https://tattvabooking.abhosting.co.in/welcome")) {
                System.out.println("Login successful for username: " + username);
            } else {
                System.out.println("Login failed for username: " + username);
            }

            // Optional: Capture a screenshot
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("screenshot" + rowNum + ".png"));

            // Close the browser for this iteration
            driver.quit();
        }

        // Close the Excel file
        workbook.close();
        inputStream.close();
    }
}

