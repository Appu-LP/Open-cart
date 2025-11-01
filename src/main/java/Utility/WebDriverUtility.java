package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	//////////////////////////////////////////Explicitly Wait//////////////////////////////////////////////
	/*
	public void explicitlyWaitForElemementClickable(By locator,WebDriver driver,int TimeInSeconds) {
		WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(TimeInSeconds));
		Wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}*/
	
	public void waitTime(WebDriver driver, int timeinSecods, By locator ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	
	
	public void explicitlyWaitForAlertToBePresent(WebDriver driver,int TimeInSeconds) {
		WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(TimeInSeconds));
		Wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public void explicitlyWaitForUrlToBePresent(WebDriver driver,int TimeInSeconds,String CompleteURL) {
		WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(TimeInSeconds));
		Wait.until(ExpectedConditions.urlToBe(CompleteURL));
		
	}
	public void explicitlyWaitForVisiblityOf(WebDriver driver,int TimeInSeconds,WebElement ele) {
		WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(TimeInSeconds));
		Wait.until(ExpectedConditions.visibilityOf(ele));
		
	}
	public void explicitlyWaitForVisiblityOfElementLocated(By locator,WebDriver driver,int TimeInSeconds) {
		WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(TimeInSeconds));
		Wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	//////////////////////////////////////////Drop And Down/////////////////////////////////////////////////


	public void selectDropDownByText(WebElement selectTag,String TextValue) {
		Select select = new Select(selectTag);
		select.selectByVisibleText(TextValue);
	}
	public void selectDropDownByIndex(WebElement selectTag,int value) {
		Select select = new Select(selectTag);
		select.selectByIndex(value);
	}
	public void selectDropDownByValue(WebElement selectTag,String Value) {
		Select select = new Select(selectTag);
		select.selectByValue(Value);
	}
	
	public void deselectDropDownByText(WebElement selectTag,String TextValue) {
		Select select = new Select(selectTag);
		select.deselectByVisibleText(TextValue);
	}
	public void deselectDropDownByIndex(WebElement selectTag,int value) {
		Select select = new Select(selectTag);
		select.deselectByIndex(value);
	}
	public void deselectDropDownByValue(WebElement selectTag,String value) {
		Select select = new Select(selectTag);
		select.deselectByValue(value);
	}
	public void deSelectAllDropDownBy(WebElement selectTag) {
		Select select = new Select(selectTag);
		select.deselectAll();
	}
	public void isMultipleDropDownByValue(WebElement selectTag) {
		Select select = new Select(selectTag);
		select.isMultiple();
	}
	
	public void getFirstSelectedOptionDropDownBy(WebElement selectTag) {
		Select select = new Select(selectTag);
		select.getFirstSelectedOption();
	}
	
	public void getAllSelectedOptionsDropDownBy(WebElement selectTag) {
		Select select = new Select(selectTag);
		select.getAllSelectedOptions();
	}

	public void getOptionsDropDownBy(WebElement selectTag) {
		Select select = new Select(selectTag);
		select.getOptions();
	}
	
	//////////////////////////////////////////Actions Class/////////////////////////////////////////////////
	public static WebDriver driver;
	Actions action=new Actions(driver);

	public void RightClick1(WebElement ele) {
		action.contextClick(ele).perform();
	}
	
	public void DoubleClick(WebElement ele) {
		action.doubleClick(ele).perform();
	}
	
	public void DragAndDrop(WebElement DragElement,WebElement DropElement) {
		action.dragAndDrop(DragElement, DropElement).perform();
	}
	
	public void ClickAndHold(WebElement ele) {
		action.clickAndHold(ele).perform();
	}
	
	public void ScrollToElement(WebElement ele) {
		action.scrollToElement(ele).perform();
	}
	
	public void ScrollByAmount(int x,int y) {
		action.scrollByAmount(x, y).perform();
	}
	
	public void MoveByOffset(int x_Offset,int y_Offset) {
		action.moveByOffset(x_Offset, y_Offset).perform();
	}
}
