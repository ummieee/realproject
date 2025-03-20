package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.homePage;
import testBase.BaseClass;

public class AddDeleteElements extends BaseClass{
	WebDriver driver;
	WebDriverWait ew = new WebDriverWait(driver,Duration.ofSeconds(5));
	@Test
	public void addOrDelete(){
		homePage hp =new homePage(driver);
		hp.click_add_remove_elements();

	}
}
