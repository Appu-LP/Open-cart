package TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import POM.LoginPage;

@Test
public class PumaTestCases {

	public void TC_Login_001() throws Throwable {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://in.puma.com/in/en/account/login?action=login_with_email");
		
		LoginPage lg=new LoginPage(driver);
		lg.getEmailTextField().sendKeys("jeevangowda016@gmail.com");
		Thread.sleep(1000);
		lg.getPasswordTextField().sendKeys("Appu@123");
		Thread.sleep(1000);
		lg.getLoginButton().click();
	}
}
