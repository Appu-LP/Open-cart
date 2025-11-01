package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	public WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id="email")
	 private WebElement emailTextField;

	 @FindBy(id="password")
	 private WebElement passwordTextField;

	 @FindBy(id="login-submit")
	 private WebElement LoginButton;
	
	
	//initialazation
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	
}
//@FindBys({@FindBy(id="email"),
//@FindBy(name="email")////it is identify the WebElement like AND operater
//})
//public WebElement emailTextField;

//*************************************************************************************

//@FindAll({
//@FindBy(id="password"),
//@FindBy(xpath="//input[@data-test-id=\"auth-field-password\"]")////it is identify the WebElement like OR operater
//})
//public WebElement passwordTextField;

