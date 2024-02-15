package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();		
		
		//IMPLICITWAIT - SE PONE AL PRINCIPIO DE TODAS LAS CONDICIONES
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//OBTENER OBJETOS/WEBELEMENTS DE LA PAGINA WEB
		WebElement userName = driver.findElement(By.id("user-name"));

		//HACER LOGIN
		userName.sendKeys("standard_user");

		driver.quit();

	}

}
