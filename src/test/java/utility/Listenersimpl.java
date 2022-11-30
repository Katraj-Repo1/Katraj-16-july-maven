package utility;

import java.io.IOException;
import java.util.Random;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests.BaseTest;

public class Listenersimpl extends BaseTest implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		
		
		String testName= result.getName()+ "_" + Screenshot.getCurrentDate(); 
		
		try {
			Screenshot.captureScreen(driver, testName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	

}
