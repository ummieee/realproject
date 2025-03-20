package testBase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.google.j2objc.annotations.Property;

public class BaseClass {
	WebDriver driver ;
	
	@BeforeClass
	public void setUp() throws IOException {
		FileReader fr = new FileReader("./src//main//resources//config.properties");
		Properties pr =new Properties();
		pr.load(fr);
		switch(pr.getProperty("browser")){
		case "chrome" : driver = new ChromeDriver();break;	
		case "edge" : driver =new EdgeDriver();
		default: System.out.println("INvalid browser");return ;
		}
//		driver = new EdgeDriver();
		driver.get(pr.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
