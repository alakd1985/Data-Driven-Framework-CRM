package alak.dutta.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class InsightlyLogInTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void insightlyLogInTest(Hashtable<String,String> data) throws InterruptedException {
		type("emailid_ID", data.get("username"));
		type("pass_NAME", data.get("password"));
		click("loginBtn_ID");
		Thread.sleep(1000);

	}
}
