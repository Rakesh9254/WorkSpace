package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.dockerjava.api.model.Driver;

public class AssertionDemo {
	@Test

	public void TestMethod() {
		WebDriver driver = new ChromeDriver();
		SoftAssert softAssert = new SoftAssert();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		String actualTitle = driver.getTitle();
		String ExpectedTitle = "Automation Testing Practice";

		softAssert.assertEquals(ExpectedTitle, actualTitle, "Title verify");

		System.out.println("verifying presence of wikipedia-icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		softAssert.assertTrue(icon.isDisplayed());

		System.out.println("verifying presence of wikipedia-search-button");
		WebElement SearchTextField = driver.findElement(By.className("wikipedia-search-button"));
		softAssert.assertTrue(SearchTextField.isDisplayed());

		driver.close();

		softAssert.assertAll();

	}

}
