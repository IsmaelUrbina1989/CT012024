package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticaSelenium {

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
		Thread.sleep(2000);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		
		//METODOS DEL EXPLORADOR
		
		//OBTENER EL TITULO DE LA PAGINA
		String title = driver.getTitle();
		System.out.println("El titulo de la pagina es: " + title);
		
		//OBTENER LA URL 
		String url = driver.getCurrentUrl();
		System.out.println("La url actual es: " + url);
		
		//METODOS DE NAVEGACION
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		
		//VERIFICA ELEMENTO DESPLEGADO EN LA PAGINA
		boolean product = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if (product) {
			System.out.println("El articulo es mostrado");
		}
		
		//OBTENER EL TEXTO DE UN WEBELEMENT 
		String prodText = driver.findElement(By.className("inventory_item_name")).getText();
		
		boolean textCorrect = prodText.contains("Sauce Labs Backpack"); //CONTAINS ES UN METODO DE JAVA QUE EVALUA 2 STRINGS
		
		if (textCorrect) {
			System.out.println("El nombre del producto es correcto");
		}else {
			System.out.println("ERROR: El producto NO es correcto");
		}		
		Thread.sleep(2000);
		
		//DROPDOWN (LISTA DESPLEGABLE)
		Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		dropdown.selectByValue("lohi");
		Thread.sleep(2000);
		
		driver.close();
	}

}
