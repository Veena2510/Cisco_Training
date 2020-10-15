package testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
WebDriver driver = null;
  @Test
  public void method1() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\veena.padala\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://google.com");
	  driver.close();

  }
}
