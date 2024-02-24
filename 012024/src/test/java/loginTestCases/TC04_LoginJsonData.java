package loginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navigationPages.LoginPage;
import setupDriver.SetupDriver;

public class TC04_LoginJsonData {

	//Declarar_Inicializar_WebDriver
	WebDriver driver = SetupDriver.setupDriver();

	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC04() {
		
		String user = WrapClass.getJsonValue("TC_04", "username");
		String pwd = WrapClass.getJsonValue("TC_04", "password");
		
		loginPage.login(user, pwd); 
	}

	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC04_LoginJsonData");
		driver.quit();
	}
}