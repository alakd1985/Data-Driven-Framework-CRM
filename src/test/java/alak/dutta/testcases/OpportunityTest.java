package alak.dutta.testcases;

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
	public void opportunityTest(String opname, String prob, String opValue, String bid, String bidtype,
			String description, String pipeline, String stage) {

		type("Opporname_XPATH", opname);
		type("winningProb_XPATH", prob);
		select("opporvalue_XPATH", opValue);
		type("bid_XPATH", bid);
		select("bidtype_XPATH", bidtype);
		type("description_XPATH", description);
		select("pipeline_XPATH", pipeline);
		type("stage_XPATH", stage);
		click("cancel_XPATH");

	}

	@Test(priority = 3)
	public void tablePrint() {
		tab("table_XPATH", "row1");
		
	}


}
