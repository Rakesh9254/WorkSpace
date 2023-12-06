package DragAndDrop;

import java.awt.Window;
import java.time.Duration;

import javax.swing.JSeparator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://jqueryui.com/draggable/");
		driver.get("https://jqueryui.com/droppable/");
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement Draggable= driver.findElement(By.id("draggable"));
		WebElement Droppable = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
//		actions.dragAndDrop(Draggable, Droppable).perform();
		
//		actions.dragAndDropBy(Droppable, 150, 150).perform();
		
		actions.clickAndHold(Draggable).release(Droppable).perform();
		
		
		
		
		driver.manage().window().minimize();
		driver.quit();
		

	}

}
