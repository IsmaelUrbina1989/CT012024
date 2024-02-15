package _seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		//EXPLICITWAIT - APLICA PARA UNA CONDICION EN ESPECIFICO		
		//OBTENER OBJETOS/WEBELEMENTS DE LA PAGINA WEB
		WebElement userName = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.id("user-name")));
		
		//HACER LOGIN
		userName.sendKeys("standard_user");

		driver.quit();
		
	}
	
}