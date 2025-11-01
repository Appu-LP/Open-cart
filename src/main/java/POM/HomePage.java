package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="account-button")
	private WebElement AcountButton;
	
	@FindBy(id="logout")
	private WebElement LogoutButton;
	
	@FindBy(xpath="//span[@data-test-id=\"account-full-name\"]")
	private WebElement AccountName;
	
	@FindBy(xpath="//span[@data-test-id=\"account-email\"]")
	private WebElement EmailName;
	
	@FindBy(xpath="//div[text()='Add new']/parent::div/parent::a")
	private WebElement AddNewButton;
	
	public WebElement getAcountButton() {
		return AcountButton;
	}

	public WebElement getLogoutButton() {
		return LogoutButton;
	}

	public WebElement getAccountName() {
		return AccountName;
	}

	public WebElement getEmailName() {
		return EmailName;
	}

	public WebElement getAddNewButton() {
		return AddNewButton;
	}
	
	
}