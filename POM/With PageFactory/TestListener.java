package TestNGPractice.Day47_POM;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Throwable throwable = result.getThrowable();
		String testName = result.getName();
		String className = result.getTestClass().getName();

		System.out.println("\n---------------------------------------------------------");
		System.out.println("--- TEST FAILURE ---");
		System.out.println("Test: " + className + "." + testName);
		System.out.println("Status: FAILED");

		// Extract and print the root cause message
		Throwable rootCause = getRootCause(throwable);
		System.out.println("Error : " + rootCause.getMessage());
		System.out.println("---------------------------------------------------------\n");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("\n---------------------------------------------------------");
		System.out.println("--- TEST PASSED ---");
		System.out.println("Test: " + result.getTestClass().getName() + "." + result.getName());
		System.out.println("Status: PASSED");
		System.out.println("---------------------------------------------------------\n");
	}

	private Throwable getRootCause(Throwable throwable) {
		Throwable rootCause = throwable;
		while (rootCause.getCause() != null && rootCause.getCause() != rootCause) {
			rootCause = rootCause.getCause();
		}
		return rootCause;
	}
}
