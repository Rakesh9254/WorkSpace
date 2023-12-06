import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerfiyAndValidateLogin {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.edrahi.com/20220808/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// pre-condition
		// driver.findElement(By.xpath("//button[text()=\"English\"]"));
		Thread.sleep(5000);
		WebElement HindiLanguageSelected = driver.findElement(By.xpath("//button[text()=\"हिन्दी\"]"));
		HindiLanguageSelected.click();
		Thread.sleep(5000);
		driver.findElement(By.id("mobile")).sendKeys("7631744096");
		WebElement SendOtpButton = driver.findElement(By.xpath("//span[text()=\"ओटीपी भेजें\"]"));
		SendOtpButton.click();
		Thread.sleep(12000);
		WebElement VerifyButton = driver.findElement(By.xpath("//button[@class=\"full-width-green-button\"]"));
		VerifyButton.click();
	}
}
