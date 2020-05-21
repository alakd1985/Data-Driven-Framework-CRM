package alak.dutta.testcases;

import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class InsightlyLogInTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void insightlyLogInTest(String userid, String pass) throws InterruptedException {
		type("emailid_ID", userid);
		type("pass_NAME", pass);
		click("loginBtn_ID");
		Thread.sleep(5000);

	}
}
