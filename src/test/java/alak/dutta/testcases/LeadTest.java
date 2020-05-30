package alak.dutta.testcases;

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
	public void leadTest(String salutation, String fname, String lname, String title, 
			String organization,String status, String email, String phone, 
			String mobile, String fax, String web, String industry,String emp, 
			String leadsource, String street,String city, String state,
			String postalcode, String country,String description)
			throws InterruptedException {
		
		type("leadSalute_XPATH", salutation);
		type("leadFname_XPATH", fname);
		type("leadLname_XPATH", lname);
		type("leadTitle_XPATH", title);
		type("leadOrganization_XPATH", organization);
		type("leadStatus_XPATH", status);
		type("lemail_XPATH", email);
		type("lphone_XPATH", phone);
		type("lmobile_XPATH", mobile);
		type("lfax_XPATH", fax);
		type("lwebsite_XPATH", web);
		type("lindustry_XPATH", industry);
		type("lemployeecount_XPATH", emp);
		select("lsource_XPATH", leadsource);
		
		type("laddress_XPATH", street);
		type("lcity_XPATH", city);
		type("lstate_XPATH", state);
		type("lpostcode_XPATH", postalcode);
		select("lcountry_XPATH", country);
		type("ldescription_XPATH", description);
		click("lcancelBtn_XPATH");
	}

}
