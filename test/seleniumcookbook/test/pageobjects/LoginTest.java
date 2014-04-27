package seleniumcookbook.test.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

import seleniumcookbook.test.pageobjects.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class LoginTest {
  private WebDriver driver;
  private String url="http://linea102.chaco.gov.ar/";
  private String user;
  private String pass
  LoginFields loginfields;
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
  }
  
  @Test
  public void setUp() {
	  loginfields=new LoginFields(driver);
	  
	  loginfields.usuario.sendKeys("user");
	  loginfields.password.sendKeys("pass");
	  loginfields.ingresar.click();
	  Assert.assertEquals("Listado de Legajos", loginfields.tituloLogin.getText());
	  System.out.print(loginfields.tituloLogin);
  }
  
  @AfterClass
  public void afterClass() {
  }

  @AfterTest
  public void afterTest() {
  }

}
