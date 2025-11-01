package TestCase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePage;
import Utility.BaseClass;
@Listeners(Utility.ListnersImplementation.class)
public class LoginTest1 extends BaseClass {
	
	@Test(groups = "RegrationTest")
	public void TC_001() throws Throwable {
		System.out.println("1st test case");
	}
	


	
	@Test(groups = "SmokeTest")
	public void TC_002() throws Throwable {
		HomePage hp=new HomePage(driver);
		WebElement AddButton=hp.getAddNewButton();
		javaScript.JavaScriptclick(driver, AddButton);
		Thread.sleep(2000);
		String adrresURL=driver.getCurrentUrl();
		if(adrresURL.equals("https://in.puma.com/in/en/account/addresses/add-address")) {
			System.out.println("Add New page is dipalyed");
			
		}		
	}
}
