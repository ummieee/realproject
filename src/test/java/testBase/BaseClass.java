package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver ;
	
	@BeforeClass
	public void setUp() {
		driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofSeconds(5));
	}	
	public void tearDown() {
		driver.close();
	}
}
