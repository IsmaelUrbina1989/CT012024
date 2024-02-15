package prueba2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;


public class Hard_assertions {
  @Test
  public void f() {
	  
	  //SU FUNCION ES VALIDAR UNA AFIRMACION Y SE DETIENE LA PRUEBA
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "Swag Labs";
	  
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  driver.close();
	  
  }
}
