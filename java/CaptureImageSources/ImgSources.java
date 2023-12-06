package CaptureImageSources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgSources {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement imageLogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));

		System.out.println("Image Source : " + imageLogo.getAttribute("src"));



		driver.quit();

	}

}
