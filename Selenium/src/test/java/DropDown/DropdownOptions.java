package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropdownOptions {
	public static void main(String[] args) {

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Navigate to the webpage containing the dropdown
		driver.get("https://pgportal.gov.in/Registration"); // Replace with your website URL

		// Locate the dropdown element
		WebElement dropdownElement = driver.findElement(By.id("country")); // Replace "dropdown" with your dropdown ID

		// Create a Select object
		Select dropdown = new Select(dropdownElement);

		// Get all options from the dropdown
		List<WebElement> options = dropdown.getOptions();
		System.out.println("Total No of DropDown: "+options.size());

		// Print all options
		System.out.println("Options in the dropdown:");
		for (WebElement option : options) {
			
			System.out.println(option.getText());
		}

		// Close the browser
		driver.quit();
	}
}
