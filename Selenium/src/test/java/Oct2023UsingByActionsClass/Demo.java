package Oct2023UsingByActionsClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);
        
        // Get the text from the element
        String text = driver.findElement(By.cssSelector(".im-para.red")).getText();
        
        // Extract the email from the text
        String emailId = text.split("at")[1].trim().split(" ")[0];
        
        driver.switchTo().window(parentId);

        // Input the extracted email into the username field
        driver.findElement(By.id("username")).sendKeys(emailId);
        
        driver.quit();
    }
}
