package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import POM.HomePage;
import POM.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	public JavaScriptUtility javaScript=new JavaScriptUtility();
	public ProportiesFileUtility pro=new ProportiesFileUtility();
	public WebDriverUtility wb=new WebDriverUtility();
	//public ActionsClassUtility action=new ActionsClassUtility();
	
	//@Parameters("browser")
	@BeforeClass(groups = {"RegrationTest","SmokeTest"})
	//public void LanchingBrowser(String BROWSER ) {      ************* for CrossBrowserExecution
		public void LanchingBrowser() {
		System.out.println("-----Lanching the Browser-----"); 
		String BROWSER="chrome";
		if(BROWSER.equals("chrome")) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
        driver = new ChromeDriver(option);
		}
		else if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//driver.get("https://in.puma.com/in/en/account/login?action=login_with_email");

		}
	
	@BeforeMethod(groups = {"RegrationTest","SmokeTest"})
	public void Login() throws Throwable{
		System.out.println("-----Login to application-----");
		Thread.sleep(3000);
	    driver.get("https://in.puma.com/in/en/account/login?action=login_with_email");
	    LoginPage lg=new LoginPage(driver);
		WebElement sendKey = lg.getEmailTextField();
//		javaScript.JavaScriptSendKeys(driver, sendKey, "jeevangowda016@gmail.com");
		sendKey.sendKeys("jeevangowda016@gmail.com");
		Thread.sleep(1000);
		lg.getPasswordTextField().sendKeys("Appu@123");
		Thread.sleep(1000);
		WebElement loginbutton = lg.getLoginButton();
		javaScript.JavaScriptclick(driver, loginbutton);
		
	}
	
	@AfterMethod(groups = {"RegrationTest","SmokeTest"})
	public void Logout() throws Throwable {
		
		System.out.println("-----Logout from application-----");
		HomePage hp=new HomePage(driver);
		WebElement AccountButton=hp.getAcountButton();
		AccountButton.click();
		Thread.sleep(2000);
		WebElement LogoutButton = hp.getLogoutButton();
		javaScript.JavaScriptclick(driver, LogoutButton);
		
	}
	
	@AfterClass(groups = {"RegrationTest","SmokeTest"})
	public void QuickBrowser() {
		System.out.println("-----quit the Browser-----");
		//driver.quit();
	}
}
