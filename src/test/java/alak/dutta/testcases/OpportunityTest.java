package alak.dutta.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class OpportunityTest extends TestBase {

	@Test(priority = 1)

	public void opportunityHome() {

		click("opportunityPage_XPATH");
		driver.navigate().refresh();
		click("NewOpportunity_XPATH");

	}

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp", priority = 2)
	public void opportunityTest(Hashtable<String,String> data) {

		type("Opporname_XPATH", data.get("name"));
		type("winningProb_XPATH", data.get("probability"));
		select("opporvalue_XPATH", data.get("op value"));
		type("bid_XPATH", data.get("bid"));
		select("bidtype_XPATH", data.get("bidtype"));
		type("description_XPATH", data.get("description"));
		select("pipeline_XPATH", data.get("pipeline"));
		type("stage_XPATH", data.get("stage"));
		click("cancel_XPATH");

	}

	@Test(priority = 3)
	public void tablePrint() {
		tab("table_XPATH", "row1");
		
	}


}
