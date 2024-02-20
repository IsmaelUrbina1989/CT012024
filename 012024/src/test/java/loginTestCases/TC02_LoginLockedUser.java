package loginTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import commonMethods.WrapClass;
import navigationPages.LoginPage;
import setupDriver.SetupDriver;

public class TC02_LoginLockedUser {

	//Declarar_Inicializar_WebDriver
	WebDriver driver = SetupDriver.setupDriver();

	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC02() {
		loginPage.login(GlobalVariables.LOCKED_USER, GlobalVariables.PASSWORD);
		boolean error = loginPage.validateLockError();
		Assert.assertTrue(error);
	}

	@AfterTest
	public void closeDriver() {
		WrapClass.takeScreenshot(driver, "TC02_LoginLockedUser");
		driver.quit();
	}
}