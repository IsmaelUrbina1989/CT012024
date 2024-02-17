package commonMethods;

import org.openqa.selenium.WebElement;

public class WrapClass {

	public static void click (WebElement webUI) {
		webUI.click();
	}

	public static void sendKeys (WebElement webUI, String textToSend) {
		webUI.sendKeys(textToSend);
	}

	public static String getText (WebElement webUI) {
		return webUI.getText();
	}
	
	public static boolean verifyElementDispleyed (WebElement webUI) {
		return webUI.isDisplayed();
	}


}
