package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class DataDrivenTest {

    public static void main(String[] args) throws Throwable {
        // Set the path to the Excel file
        String excelFilePath = "TestData.xlsx";

        // Create a FileInputStream to read the Excel file
        FileInputStream inputStream = new FileInputStream("/Users/rakesh9254/Desktop/TestData.xlsx");

        // Create a workbook from the Excel file
        Workbook workbook = new XSSFWorkbook(inputStream);

        // Get the desired sheet from the workbook (e.g., "Sheet1")
        Sheet sheet = workbook.getSheet("Sheet1");

        // Loop through rows in the Excel sheet (starting from row 1)
        for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
            // Set up Chrome WebDriver for each iteration
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            WebDriver driver = new ChromeDriver(options);

            Row row = sheet.getRow(rowNum);

            // Get data from Excel columns (assuming column 0 is username and column 1 is password)
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(0).getStringCellValue();

            // Your Selenium test steps go here
            driver.get("https://tattvabooking.abhosting.co.in/login");
            WebElement emailTextField = driver.findElement(By.id("username"));
            WebElement pwdTextField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.cssSelector("button.btn.btn-success.pull-right"));

            emailTextField.sendKeys(username);
            Thread.sleep(2000);
            pwdTextField.sendKeys(password);
            Thread.sleep(2000);
            loginButton.click();
            Thread.sleep(2000);

            // Add assertions or any other logic here to validate the test

            // Optional: Capture screenshots or perform other actions

            // Close the browser for this iteration
            driver.quit();
        }

        // Close the Excel file
        workbook.close();
        inputStream.close();
    }
}
