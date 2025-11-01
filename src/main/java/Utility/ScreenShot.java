package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenShot extends BaseClass implements ITestListener{


	public void testFailure(ITestResult result) {
		String failmethod = result.getMethod().getMethodName().toString();
	}
		
}







