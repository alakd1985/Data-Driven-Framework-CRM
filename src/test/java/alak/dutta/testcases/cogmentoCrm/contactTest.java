package alak.dutta.testcases.cogmentoCrm;

import java.util.Hashtable;

import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class contactTest extends TestBase {
	@Test(priority = 1)
	public void doNavigate() {
		click("contact_XPATH");
		driver.navigate().refresh();
		click("newcontact_XPATH");
	}
	
	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp",priority = 2)
	public void contacttest(Hashtable<String,String> data) throws InterruptedException {
		type("fname_XPATH", data.get("FirstName"));
		type("lname_XPATH", data.get("LastName"));
		type("mname_XPATH", data.get("MiddleName"));
		
		type("company_XPATH", data.get("company"));
		click("blankClick_XPATH");
		type("email_XPATH", data.get("email"));
		type("businessemail_XPATH", data.get("business email"));

		type("description_XPATH", data.get("description"));
		type("address_XPATH", data.get("address"));
		type("city_XPATH", data.get("city"));
		type("state_XPATH", data.get("state"));
		type("zip_XPATH", data.get("zipcode"));
	}
}
