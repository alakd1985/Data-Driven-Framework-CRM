package alak.dutta.listeners;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class CustomListeners extends TestBase implements ITestListener {

	public void onFinish(ITestContext arg0) {

	}

	public void onStart(ITestContext arg0) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	public void onTestFailure(ITestResult arg0) {

		System.setProperty("org.uncommons.reportng.escape-output", "false");
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {

			e.printStackTrace();
		}
		test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+"FAILED with Exceptions: "+arg0.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+TestUtil.screenshotName+"><img src="+TestUtil.screenshotName+" height=200 width=200></img></a>");
		reports.endTest(test);
		reports.flush();

	}

	public void onTestSkipped(ITestResult arg0) {
	}

	public void onTestStart(ITestResult arg0) {
		test = reports.startTest(arg0.getName().toUpperCase());

	}

	public void onTestSuccess(ITestResult arg0) {
		
		test.log(LogStatus.PASS, arg0.getName().toUpperCase()+"PASS");
		reports.endTest(test);
		reports.flush();

	}

	public void onFinish(ISuite arg0) {

	}

	public void onStart(ISuite arg0) {

	}
}
