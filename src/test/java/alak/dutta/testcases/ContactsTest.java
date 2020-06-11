package alak.dutta.testcases;

import java.util.Hashtable;


import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class ContactsTest extends TestBase {

	@Test(priority = 1)
	public void contactPage() throws InterruptedException {
		click("contacts_XPATH");
		driver.navigate().refresh();
		Thread.sleep(1500);
		click("newcontact_XPATH");
		Thread.sleep(3000);
	}

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp", priority = 2)

	public void contactsTest(Hashtable<String,String> data)
			throws InterruptedException

	{
		type("name_NAME", data.get("salutation"));
		type("firstname_XPATH", data.get("FirstName"));
		type("lastname_XPATH", data.get("LastName"));
		type("title_XPATH", data.get("Title"));
		type("email_XPATH", data.get("emaili"));
		type("phone_XPATH", data.get("phone"));
		type("homephone_XPATH", data.get("homephone"));
		type("cellphone_XPATH", data.get("mobilephone"));
		type("otherphone_XPATH", data.get("otherphone"));
		type("assistantphone_XPATH", data.get("assistantphone"));
		type("assitantname_XPATH", data.get("Assistant name"));
		type("fax_XPATH", data.get("fax"));
		Thread.sleep(1000);
		type("link_XPATH", data.get("linkdin"));
		type("facek_XPATH", data.get("facebook"));
		type("twit_XPATH", data.get("twitter"));
		type("mailaddress_XPATH", data.get("mailing address"));
		type("mailcity_XPATH", data.get("mailing city"));
		type("mailstate_XPATH", data.get("mailing state"));
		type("mailpostcode_XPATH", data.get("post code"));
		select("mailcountry_XPATH", data.get("mailing country"));
		type("otherstreet_XPATH", data.get("other address"));
		type("othercity_XPATH", data.get("other city"));
		type("otherstate_XPATH", data.get("other state"));
		type("otherpostcode_XPATH", data.get("other post code"));
		select("othercountry_XPATH", data.get("other country"));
		type("description_ID", data.get("description"));
		// type("tag_XPATH", taglist);
		click("cancelBtn_XPATH");

	}

	/*
	 * @Test(priority = 3)
	 * 
	 * public void checkProperty() {
	 * 
	 * // click("secondCheckbox_XPATH"); // Assert.assertEquals("edit_XPATH",
	 * "edit_XPATH"); click("fourth_XPATH"); click("close_XPATH");
	 * driver.navigate().refresh(); WebElement element =
	 * driver.findElement(By.xpath(or.getProperty("contact_XPATH"))); Select s= new
	 * Select(element); s.selectByVisibleText("Recently Viewed");
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 4) public void contactTable() {
	 * 
	 * tab("contactTable_ID", "contactRow"); }
	 */

}
