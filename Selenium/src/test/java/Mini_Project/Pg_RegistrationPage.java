package Mini_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pg_RegistrationPage {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://pgportal.gov.in/Registration");
		WebElement NameText = driver.findElement(By.id("Name"));
		NameText.sendKeys(Keys.chord("Rakesh"));
		driver.findElement(By.className("iCheck-helper")).click();
		WebElement AddressText = driver.findElement(By.xpath("//input[@id='Address1']"));
		AddressText.sendKeys("Biranchiya");
		WebElement AddressText2 = driver.findElement(By.id("Address2"));
		AddressText2.sendKeys("Banmankhi");
		WebElement Address3 = driver.findElement(By.id("Address3"));
		Address3.sendKeys("Banmankhi");
		WebElement CountryText = driver.findElement(By.id("country"));
		Select select = new Select(CountryText);
		select.selectByVisibleText("India");
		WebElement StateText = driver.findElement(By.id("state"));
		Select select2 = new Select(StateText);
		select2.selectByVisibleText("Bihar");
		WebElement districtText = driver.findElement(By.id("district"));
		Select select3 = new Select(districtText);
		select3.selectByIndex(5);
		WebElement PincodeText = driver.findElement(By.name("Pincode"));
		PincodeText.sendKeys("854301");
		WebElement MobileNotext = driver.findElement(By.id("MobileNo"));
		MobileNotext.sendKeys("7631744096");
		WebElement EmailAddress = driver.findElement(By.id("EmailAddress"));
		EmailAddress.sendKeys("rakeshkumarroshan62@gmail.com");
		driver.findElement(By.className("iradio_square-blue checked")).click();
		Thread.sleep(12000);
		driver.findElement(By.className("btn btn-primary btn-social")).click();

		driver.manage().window().minimize();
		driver.quit();

	}

}
