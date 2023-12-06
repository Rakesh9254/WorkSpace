package AutoDatePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class DataPicker {

	public static void main(String[] args) {

		String expectedDay = "31";
		String expectedMonth = "August";
		String expectedYear = "2025";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);

		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();

		while (true) {
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear)) {
				List<WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));

				for (WebElement e : daysList) {
					String calenderDay = e.getText();
					if (calenderDay.equals(expectedDay)) {
						e.click();
						break;

					}
				}

				break;
			} else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		driver.quit();

	}

}
