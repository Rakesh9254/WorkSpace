package CodeStudio1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchNewWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		System.out.println("First page Title : " + driver.getTitle());


		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demoqa.com/progress-bar");

		System.out.println("Second page Title : " + driver.getTitle());

//		Set<String> windowHandle = driver.getWindowHandles();
//		List<String> handle = new ArrayList<String>();
//		handle.addAll(windowHandle);



		driver.quit();


	}

}
