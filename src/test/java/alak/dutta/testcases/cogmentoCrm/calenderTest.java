package alak.dutta.testcases.cogmentoCrm;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class calenderTest extends TestBase {
	@Test(priority = 1)
	public void gotoCalenderPage() throws InterruptedException {
		click("calender_XPATH");
		Thread.sleep(2000);
		driver.navigate().refresh();
		/*
		 * WebElement element =
		 * driver.findElement(By.id(or.getProperty("newButton_XPATH")));
		 * wait.until(ExpectedConditions.visibilityOf(element));
		 */
		click("newButton_XPATH");
		driver.navigate().refresh();
		}

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp", priority = 2)
	public void calendertest(Hashtable<String, String> data) throws InterruptedException {

		type("title_XPATH", data.get("title"));
		/*
		 * type("startDate_XPATH", data.get("startDate")); type("endDate_XPATH",
		 * data.get("endDate"));
		 */
		//select("category_NAME", data.get("category"));
		type("descriptionc_XPATH", data.get("description"));
		type("locationl_XPATH", data.get("location"));
		
		  type("deal_XPATH", data.get("deal"));
		  driver.findElement(By.xpath("//body/div[@id='ui']/div/div/div/div/div/form/div[8]/div[1]/div[1]")).click();		  
		
		 WebElement element = driver.findElement(By.xpath("//input[@name='identifier']"));

		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
		 Thread.sleep(2000);
				
		/*
		 * type("task_XPATH", data.get("task")); type("case_XPATH", data.get("case"));
		 */
		/*
		 * select("alertBefore_XPATH", data.get("alertBefore"));
		 * select("alertvia_XPATH", data.get("alertvia"));
		 */
		
		
		driver.findElement(By.xpath("//div[@name='channels']")).click();
		driver.findElement(By.xpath("//i[@class='delete icon']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'SMS')]")).click();
		Assert.assertEquals("SMS", "SMS");
		driver.findElement(By.xpath("//div[@name='minutesBefore']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'1 Hour')]")).click();
		Assert.assertEquals("1 Hour", "1 Hour");
		type("remindertime_XPATH", data.get("reminder"));
		//type("participants_XPATH", data.get("participants"));
		type("company_XPATH", data.get("company"));
		type("identifier_XPATH", data.get("identifier"));

	}

}
