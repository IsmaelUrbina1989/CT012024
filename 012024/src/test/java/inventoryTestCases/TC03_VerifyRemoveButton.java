package inventoryTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonMethods.GlobalVariables;
import navigationPages.InventoryPage;
import navigationPages.LoginPage;
import setupDriver.SetupDriver;

public class TC03_VerifyRemoveButton {

	//Declarar_Inicializar_WebDriver
	WebDriver driver = SetupDriver.setupDriver();

	//PageObjects
	LoginPage loginPage = new LoginPage(driver);
	InventoryPage inventoryPage = new InventoryPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}

	@Test
	public void TC03() {
		loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.PASSWORD);
		boolean isDispleyed = inventoryPage.verifyRemoveButton();
		Assert.assertTrue(isDispleyed); 
	}

	@AfterTest
	public void closeDriver() {
		driver.quit();
	}
}