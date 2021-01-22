package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ToggleAllboxPage;
import util.BrowserFactory;

public class ToggleAllboxTest {

WebDriver driver;
	
	
	@Test
	public void ClickOnToggleAllBox(){
		
		driver = BrowserFactory.launchBrowser();
		ToggleAllboxPage ToggleAllBox = PageFactory.initElements(driver, ToggleAllboxPage.class);
		 ToggleAllBox.clickToggleAllBoxField();
		
	}
}
