package alak.dutta.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.ReadExcel;
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

	public void contactsTest(String salutation, String fname, String lname, String title, String email, String phne,
			String homephne, String mobilephone, String otherphone, String assitanntPhone, String assistantname,
			String fax, String linkdin, String facebook, String twitter, String mailingadd, String mailingcity,
			String mailingstate, String postcode, String mailcountry, String otheraddress, String othercity,
			String otherstate, String othpostalcode, String othercounry, String description, String taglist)
			throws InterruptedException

	{
		type("name_NAME", salutation);
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
		Thread.sleep(3000);
		type("link_XPATH", linkdin);
		type("facek_XPATH", facebook);
		type("twit_XPATH", twitter);
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
		// type("tag_XPATH", taglist);
		click("cancelBtn_XPATH");

	}

	@Test(priority = 3)

	public void checkProperty() {

//		click("secondCheckbox_XPATH");
//		Assert.assertEquals("edit_XPATH", "edit_XPATH");
		click("fourth_XPATH");
		click("close_XPATH");
		driver.navigate().refresh();
		WebElement element = driver.findElement(By.xpath(or.getProperty("contact_XPATH")));
		Select s= new Select(element);
		s.selectByVisibleText("Recently Viewed");

	}

	@Test(priority = 4)
	public void contactTable() {

		tab("contactTable_ID", "contactRow");
	}

}