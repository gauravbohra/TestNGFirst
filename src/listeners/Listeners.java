package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {
	
	@Override
	public void onTestStart(ITestResult itr) {
		System.out.println("Test started");
	}

	@Override
	public void onTestSuccess(ITestResult itr) {
		System.out.println("Test passed");
	}
	
	@Override
	public void onTestFailure(ITestResult itr) {
		System.out.println("Test failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult itr) {
		System.out.println("Test skipped");
	}
}
