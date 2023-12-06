package CodeStudio1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadioButtom {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");

		driver.get("https://www.calculator.net/");

		List<WebElement> RadioButtomList = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total No of Radio Button On the WebPage : " + RadioButtomList.size());

		driver.quit();

	}

}
