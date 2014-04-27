package seleniumcookbook.test.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginFields {
	
	@FindBy(id="username")
	public WebElement usuario;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(id="_submit")
	public WebElement ingresar;
	@FindBy(how=How.CSS, using="html body div.container-fluid div.row-fluid div.span12 div.span8 h2" )
	public WebElement tituloLogin;
	
	public LoginFields(WebDriver driver){
		PageFactory.initElements(driver, this);
	}	

}
