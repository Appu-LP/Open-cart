package TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePage;
import Utility.BaseClass;
@Listeners(Utility.ListnersImplementation.class)

public class LoginTest extends BaseClass{

	@Test(groups = "RegrationTest")
	public void TC_003() throws Throwable {
		HomePage hp=new HomePage(driver);
		WebElement AcName = hp.getAccountName();
		if(AcName.getText().equals("Jeevan L P")) {
			System.out.println("verify the AccountName");
		}
		
	}
	@Test(groups = "SmokeTest")
	public void TC_004() throws Throwable {
		HomePage hp=new HomePage(driver);
		if(hp.getEmailName().getText().equals("jeevangowda016@gmail.com")) {
			
		}
	}
	
}




	

