package Oct2023UsingByActionsClass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();

		driver.switchTo().window(childId);

		String text = driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
		System.out.println(text);
		driver.switchTo().window(parentId);
		String text1 = driver.findElement(By.xpath("//h3[normalize-space()='Opening a new window']")).getText();
		System.out.println(text1);

		driver.manage().window().minimize();
		driver.quit();

	}
}