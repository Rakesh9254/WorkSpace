package HttpCookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Set<Cookie> cookiesList = driver.manage().getCookies();
		System.out.println("CookiesList : " + cookiesList.size());

		for(Cookie ck : cookiesList ) {
			System.out.println(ck.getName() + " : " + ck.getValue());
		}



		driver.quit();


	}

}
