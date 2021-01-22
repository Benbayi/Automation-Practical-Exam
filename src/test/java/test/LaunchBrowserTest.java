package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.BrowserFactory;

public class LaunchBrowserTest {
	
	WebDriver driver;

	@Test
	public void OpenBrowser() {
		driver = BrowserFactory.launchBrowser();

		
	}

}
