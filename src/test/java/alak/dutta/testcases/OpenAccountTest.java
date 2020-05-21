package alak.dutta.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class OpenAccountTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class,dataProvider = "dp")
	public void openAccountTest(String customer, String currency) throws InterruptedException {
		click("openacccount_XPATH");
		Thread.sleep(2000);
		select("customer_NAME", customer);
		select("currency_NAME", currency);

		click("process_XPATH");
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();

		alert.accept();
		Thread.sleep(2000);
	}

	@DataProvider
	public Object[][] getData() {
		String sheetName = "OpenAccountTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][cols];
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}

		}

		return data;
	}

}
