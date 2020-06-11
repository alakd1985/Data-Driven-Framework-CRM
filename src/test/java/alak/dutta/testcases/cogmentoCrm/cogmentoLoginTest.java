package alak.dutta.testcases.cogmentoCrm;

import java.util.Hashtable;

import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class cogmentoLoginTest extends TestBase {
	
	@Test(priority = 1)
	public void doNavigate() {
		driver.get(config.getProperty("urlCogmento"));

	}

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp",priority = 2)
	public void cogmentologinTest(Hashtable<String,String> data) throws InterruptedException {
		type("emailid_NAME", data.get("username"));
		type("passc_NAME", data.get("password"));
		click("loginBtn_XPATH");
		Thread.sleep(1000);

	}
}
