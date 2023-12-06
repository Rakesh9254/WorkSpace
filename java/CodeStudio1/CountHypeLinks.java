package CodeStudio1;

import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CountHypeLinks {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");

		List<WebElement> linkElements = driver.findElements(By.tagName("a"));

		System.out.println("Total Links On WebPage : " + linkElements.size());
		for (WebElement e1:linkElements) {
			System.out.println(e1.getText());
		}

		driver.manage().window().minimize();
		driver.close();
		driver.quit();

	}

}
