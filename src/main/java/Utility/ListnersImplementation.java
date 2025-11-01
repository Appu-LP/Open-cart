package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersImplementation extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String FailedMethod = result.getMethod().getMethodName().toString();
		
		String Time = LocalTime.now().toString().replace(':', '-');
		TakesScreenshot ts=(TakesScreenshot)driver;
		File TempFile = ts.getScreenshotAs(OutputType.FILE);
		File PermFile = new File("./src/test/resources/drivers/"+FailedMethod+Time+"123.png");
		try {
			org.openqa.selenium.io.FileHandler.copy(TempFile, PermFile);
		} catch (IOException e) {
		    System.out.println("not been executed");
			e.printStackTrace();
		}
	}
}
