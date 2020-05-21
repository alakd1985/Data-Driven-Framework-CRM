package alak.dutta.testcases.Task;

import org.testng.annotations.Test;

import alak.dutta.base.TestBase;
import alak.dutta.utilities.TestUtil;

public class NewTaskTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void newTaskTest(String taskname, String catValue, String progress, String description, String prvate)
			throws InterruptedException {
		click("newTask_XPATH");
		Thread.sleep(5000);

		type("taskname_XPATH", taskname);
		select("category_XPATH", catValue);
		type("progress_XPATH", progress);
		type("description_XPATH", description);
		select("taskVisiblity_XPATH", prvate);
		click("canelBtn_XPATH");
		Thread.sleep(2000);

	}

}