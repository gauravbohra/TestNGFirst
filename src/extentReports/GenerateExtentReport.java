package extentReports;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReport {
	ExtentReports extentReport;
	ExtentTest extentTest;

	@BeforeTest
	public void startReport() {
		extentReport = new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("target/index.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Extents Reports demo");
		extentReport.attachReporter(spark);
	}

	@Test
	public void demoReportPass() {
		extentTest = extentReport.createTest("demoReportPass");
		Assert.assertTrue(true);
		extentTest.log(Status.PASS, "Condition is true");
	}

	@Test
	public void demoReportFail() {
		extentTest = extentReport.createTest("demoReportFail");
		Assert.assertTrue(false);
		extentTest.log(Status.FAIL, "Condition is false");
	}	

	@AfterMethod
	public void afterEachTest(ITestResult itr) {
		if (itr.getStatus() == ITestResult.FAILURE) {
			extentTest.log(Status.FAIL, itr.getThrowable());
		}
		extentReport.removeTest(extentTest);
	}

	@AfterTest
	public void endReport() {
		extentReport.flush();
	}
}
