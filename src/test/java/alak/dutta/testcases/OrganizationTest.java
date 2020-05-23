package alak.dutta.testcases;

import org.testng.annotations.Test;

import alak.dutta.base.TestBase;

import alak.dutta.utilities.TestUtil;

public class OrganizationTest extends TestBase {

	@Test(priority = 1)
	public void doOrganization() {
		click("organization_XPATH");
		driver.navigate().refresh();
		click("neworga_XPATH");
	}

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp", priority = 2)
	public void organizationTest(String oraganization, String phone, String fax, String website, String linkdin,
			String facebook, String twitter, String street, String city, String state, String postcode, String country,
			String sstreet, String scity, String sstate, String spostcode, String scountry)
			throws InterruptedException {

		type("oraganiname_XPATH", oraganization);
		type("phonenum_XPATH", phone);
		type("faxnum_XPATH", fax);
		type("website_XPATH", website);
		type("linkdin_XPATH", linkdin);
		type("facebook_XPATH", facebook);
		type("twitter_XPATH", twitter);
		type("billingst_XPATH", street);
		type("billingcity_XPATH", city);
		type("billingstate_XPATH", state);
		type("billingpostalcode_XPATH", postcode);
		select("billingcountry_XPATH", country);
		type("shippingst_XPATH", sstreet);
		type("shippingcity_XPATH", scity);
		type("shippingstate_XPATH", sstate);
		type("shippingcode_XPATH", spostcode);
		select("shippingcountry_XPATH", scountry);
		click("cancelBtn_XPATH");
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void organizationTable() {
		driver.navigate().refresh();
		tab("organizationTable_XPATH", "row");
	}

}
