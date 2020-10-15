package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	WebDriver driver = null;
	public void method1() {
		
		System.setProperty("webdriver.chorme.driver", "C:\\Users\\veena.padala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.close();
		
	}

}
