package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveButtonPage;
import page.RemoveSingleListItemPage;
import util.BrowserFactory;

public class RemoveSingleListItemTest {
	
	WebDriver driver;

	public void RemoveSingleListItem() {

		driver = BrowserFactory.launchBrowser();

		RemoveSingleListItemPage RemoveSingleListItem = PageFactory.initElements(driver,
				RemoveSingleListItemPage.class);
		RemoveButtonPage remove = PageFactory.initElements(driver, RemoveButtonPage.class);

		RemoveSingleListItem.clickSingleItemCheckBox();
		remove.clickRemoveButton();

	}

}
