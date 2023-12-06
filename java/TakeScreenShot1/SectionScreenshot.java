package TakeScreenShot1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SectionScreenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");


		WebElement sectionElement = driver.findElement(By.xpath("//strong[normalize-space()='Featured products']"));

		File srcFile = sectionElement.getScreenshotAs(OutputType.FILE);

		File destFile = new File("./ErrorScreenShot/Section.png");

		driver.manage().window().minimize();
		driver.quit();

	}

}
