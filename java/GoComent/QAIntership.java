package GoComent;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QAIntership {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://app.jazz.co/app/v2/login?redirect=https:~2F~2Fapp.jazz.co~2Fapp~2Fv2~2Fjob~2F6681273~2Fcandidate~2F240182807~2Fprofile");
		WebElement NewCreateAC = driver.findElement(By.xpath("//a[text()='Start a Free Trial']"));
		NewCreateAC.click();

		driver.manage().window().minimize();
		driver.quit();

	}

}
