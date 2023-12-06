package test.java.OCT2023va.OCT2023;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		Dimension dimension = new Dimension(500, 500);
		driver.manage().window().setSize(dimension);
		
		//set the position of window
		Point point = new Point(250, 250);
		driver.manage().window().setPosition(point);
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.quit();
		

	}

}
