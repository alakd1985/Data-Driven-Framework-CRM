package alak.dutta.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class LeadTest extends TestBase {
	@Test(priority = 1)
	public void leadHome() {
		click("leadBtn_XPATH");
		driver.navigate().refresh();
		click("newLead_XPATH");
	}

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp",priority = 2)
	public void leadTest(Hashtable<String,String> data)
			throws InterruptedException {
		
		type("leadSalute_XPATH",data.get("salutation"));
		type("leadFname_XPATH", data.get("firstname"));
		type("leadLname_XPATH", data.get("lastname"));
		type("leadTitle_XPATH", data.get("Title"));
		type("leadOrganization_XPATH", data.get("Organization"));
		type("leadStatus_XPATH", data.get("Status"));
		type("lemail_XPATH", data.get("email"));
		type("lphone_XPATH", data.get("phone"));
		type("lmobile_XPATH", data.get("mobile"));
		type("lfax_XPATH", data.get("fax"));
		type("lwebsite_XPATH", data.get("website"));
		type("lindustry_XPATH", data.get("industry"));
		type("lemployeecount_XPATH", data.get("employee"));
		select("lsource_XPATH", data.get("source"));
		
		type("laddress_XPATH", data.get("address"));
		type("lcity_XPATH", data.get("mailling city"));
		type("lstate_XPATH", data.get("mailing state"));
		type("lpostcode_XPATH", data.get("post code"));
		select("lcountry_XPATH", data.get("mailing country"));
		type("ldescription_XPATH", data.get("description"));
		click("lcancelBtn_XPATH");
	}

}
