package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {
    	
	public WebDriver BrowserDriver;
	public JavascriptExecutor jsExecutor;
	public WebElement WElement;
	
	public void JavaScriptclick(WebDriver BrowserDriver,WebElement WElement) {
		 jsExecutor=(JavascriptExecutor)BrowserDriver;
		 jsExecutor.executeScript("arguments[0].click();", WElement);
	}
	
	public void JavaScriptSendKeys(WebDriver driver,WebElement ele,String data) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1];", ele);
		}
	public void JavaScriptScrollBy(WebDriver driver,int x,int y) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy("+x+","+y+");");
		}
	public void JavaScriptTillElement(WebDriver driver,WebElement ele) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		}
	
	
}
