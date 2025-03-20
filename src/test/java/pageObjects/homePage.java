package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage extends BasePage{
	public homePage(WebDriver driver) {
		super(driver);
	}
	
@FindBy (xpath = "Add/Remove Elements") WebElement add_remove_elements;


public void click_add_remove_elements () {
	WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(5));
	ew.until(ExpectedConditions.elementToBeClickable(add_remove_elements)).click();
	
}
}