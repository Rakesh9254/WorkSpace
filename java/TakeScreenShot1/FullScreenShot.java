package TakeScreenShot1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class FullScreenShot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pgportal.gov.in/");

//		TakesScreenshot takesScreenshot = ((TakesScreenshot)driver);
//		File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//
//		File permFile = new File("./ErrorScreenShot/Scrshot12.png");
//
//		FileUtils.copyFile(srcFile, permFile);
		
		
//		TakesScreenshot takesScreenshot = ((TakesScreenshot)driver);
//		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
//		File PermantFile = new File("./ErrorScreenShot/Scrshot12.png");
//		FileUtils.copyFile(sourceFile, PermantFile);
		
		
//		TakesScreenshot takesScreenshot = ((TakesScreenshot)driver);
//		File sourceFile= takesScreenshot.getScreenshotAs(OutputType.FILE);
//		File Permfile = new File("./ErrorScreenShot/Rakesh.png");
//		
//		FileUtils.copyFile(sourceFile, Permfile);
		
		
//		
		
		
		
		TakesScreenshot takesScreenshot = ((TakesScreenshot)driver);
		File sourefilrFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File tempFile = new File("./nnnnn/takkk.png");
		FileUtils.copyFile(sourefilrFile, tempFile);
		
		
		
		

		driver.manage().window().minimize();
		driver.quit();

	}

}
