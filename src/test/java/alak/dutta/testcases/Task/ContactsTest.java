package alak.dutta.testcases.Task;


import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class ContactsTest extends TestBase {

	@Test
	public void a() throws InterruptedException {
		click("contacts_XPATH");
		driver.navigate().refresh();
		Thread.sleep(1500);
		click("newcontact_XPATH");
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[@id='Contact_SALUTATION']")).sendKeys("alak");
	}

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void contactsTest(String salutation, String fname, String lname,String title, String email, String phne,
			String homephne, String mobilephone, String otherphone,String assitanntPhone, String assistantname,
			String fax,
			String linkdin, String facebook, String twitter,String mailingadd, String mailingcity,
			String mailingstate,
			String postcode, String mailcountry, String otheraddress,String othercity,String otherstate,
			String othpostalcode, String othercounry, String description,String taglist)

	{
		type("name_XPATH", salutation);

		type("firstname_XPATH", fname);
		type("lastname_XPATH", lname);
		type("title_XPATH", title);
		type("email_XPATH", email);
		type("phone_XPATH", phne);
		type("homephone_XPATH", homephne);
		type("cellphone_XPATH", mobilephone);
		type("otherphone_XPATH", otherphone);
		type("assistantphone_XPATH", assitanntPhone);
		type("assitantname_XPATH", assistantname);
		type("fax_XPATH", fax);
		type("linkdin_XPATH", linkdin);
		type("facebook_XPATH", facebook);
		type("twitter_XPATH", twitter);
		type("mailaddress_XPATH", mailingadd);
		type("mailcity_XPATH", mailingcity);
		
		type("mailstate_XPATH", mailingstate);
		type("mailpostcode_XPATH", postcode);
		select("mailcountry_XPATH", mailcountry);
		type("otherstreet_XPATH", otheraddress);
		type("othercity_XPATH", othercity);
		type("otherstate_XPATH", otherstate);
		type("otherpostcode_XPATH", othpostalcode);
		select("othercountry_XPATH", othercounry);
		type("description_ID", description);
		type("tag_XPATH", taglist);

//		, String lname, String title, String email, String phne,
//		String homephne, String mobilephone, String otherphone, String assitanntPhone, String assistantname,
//		String fax, String linkdin, String facebook, String twitter, String mailingadd, String mailingcity,
//		String mailingstate, String postcode, String mailcountry, String otheraddress, String othercity,
//		String otherstate, String othpostalcode, String othercounry, String description, String taglist

	}
}
