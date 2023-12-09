package CodeStudio1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");

		WebElement buttom = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

		Actions act = new Actions(driver);
		act.contextClick(buttom).perform();//right click action

		driver.manage().window().minimize();
		driver.quit();

	}

}
