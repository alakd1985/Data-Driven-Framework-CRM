package alak.dutta.testcases;

import java.util.Hashtable;

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
	public void organizationTest(Hashtable<String,String> data)
			throws InterruptedException {

		type("oraganiname_XPATH", data.get("Organization name"));
		type("phonenum_XPATH", data.get("phone"));
		type("faxnum_XPATH", data.get("fax"));
		type("website_XPATH",data.get("website"));
		type("linkdin_XPATH",data.get("linkdin"));
		type("facebook_XPATH",data.get("facebook"));
		type("twitter_XPATH",data.get("twitter"));
		type("billingst_XPATH",data.get("billing"));
		type("billingcity_XPATH",data.get("city"));
		type("billingstate_XPATH",data.get("state"));
		type("billingpostalcode_XPATH",data.get("postcode"));
		select("billingcountry_XPATH",data.get("country"));
		type("shippingst_XPATH", data.get("street"));
		type("shippingcity_XPATH", data.get("scity"));
		type("shippingstate_XPATH", data.get("sstate"));
		type("shippingcode_XPATH", data.get("spcode"));
		select("shippingcountry_XPATH", data.get("scountry"));
		click("cancelBt_XPATH");
		Thread.sleep(2000);

	}

	@Test(priority = 3)
	public void organizationTable() {
		driver.navigate().refresh();
		tab("organizationTable_XPATH", "row");
	}

}
