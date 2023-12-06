package QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pgportal.gov.in/Registration");
		System.out.println("Source code is : "+ driver.getPageSource());
		
		WebElement dropdownElement = driver.findElement(By.className("select2-search__field"));
		
		Select select = new Select(dropdownElement);
		select.selectByIndex(10);
		
		
		
		
		driver.manage().window().minimize();
		driver.quit();

	}

}
