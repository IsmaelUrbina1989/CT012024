package _seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();		
		Thread.sleep(2000);

		//OBTENER OBJETOS/WEBELEMENTS DE LA PAGINA WEB
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));

		//HACER LOGIN
		userName.sendKeys("standard_user");
		Thread.sleep(500);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(500);
		loginBtn.click();

		//FINDELEMENTS
		List<WebElement> prodList = driver.findElements(By.className("inventory_item_name"));		
		System.out.println("Numero de elementos: " + prodList.size());

		String primerProd = prodList.get(0).getText();
		String segProd = prodList.get(1).getText();
		System.out.println(primerProd);
		System.out.println(segProd);

		int b = 1; 
		for (int i = 0; i < prodList.size(); i++) {
			System.out.println("Producto " + b + ": " + prodList.get(i).getText());			
			b++;			
		}

		driver.quit();

	}
}