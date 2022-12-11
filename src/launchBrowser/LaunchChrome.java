package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new ChromeDriver();

	}

}
