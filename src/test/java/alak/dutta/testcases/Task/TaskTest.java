package alak.dutta.testcases.Task;

import org.testng.annotations.Test;

import alak.dutta.base.TestBase;


public class TaskTest extends TestBase {

	@Test
	public void taskTest() throws InterruptedException {

		click("task_XPATH");
		//select("taskdropdown_ID", tasks);
		//click("taskdropdown_ID");
		//click("allComptask_XPATH");
		Thread.sleep(3000);
//(dataProviderClass = TestUtil.class, dataProvider = "dp")
	}

}
