package setupDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class SetupDriver {

	public static WebDriver setupDriver() {		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	/*
	WebDriver driver = new ChromeDriver();
	WebDriver driver = new FirefoxDriver();
    WebDriver driver = new EdgeDriver();
    WebDriver driver = new InternetExplorerDriver();
	 */

}