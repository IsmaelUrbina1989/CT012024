package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

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

	public static void takeScreenshot (WebDriver webDriver, String testCaseName) {
		//Toman el screenshot de la pagina sin formato
		File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);

		//Establece ruta donde se guarda el screenshot
		String screenshotPath = "./test-output/ExecutionResults";

		try {
			FileHandler.createDir(new File (screenshotPath));//Crea el folder usando la ruta especifica de la variable "screenshotPath"
			FileHandler.copy(scrFile, new File(screenshotPath + File.separatorChar + testCaseName + ".png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getJsonValue (String jsonFile, String jsonKey) {
		//JsonData		
		try {
			InputStream inputStream = new FileInputStream (GlobalVariables.EXT_DATA + jsonFile + ".jason"); //USAMOS LA RUTA DONDE OBTENEMOS EL ARCHIVO JSON
			JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
			
			//LEER LOS DATOS
			String jsonValue = jsonObject.getJSONObject(jsonFile).getString(jsonKey);
			return jsonValue;
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}
}