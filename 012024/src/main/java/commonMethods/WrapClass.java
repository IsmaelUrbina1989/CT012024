package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

	public static String getCellData(String excelName, int row, int column) {
		//LEER ARCHIVO EXCEL
		try {
			FileInputStream fis = new FileInputStream(GlobalVariables.EXT_DATA + excelName + ".xlsx");
			//CONSTRUIR XLSX COMO OBJETO DE JAVA
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheetAt(0);
			Row rowobj = sheet.getRow(row);
			Cell cell = rowobj.getCell(column);
			String value = cell.getStringCellValue();
			return value;

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return null; 
		}		
	}
}