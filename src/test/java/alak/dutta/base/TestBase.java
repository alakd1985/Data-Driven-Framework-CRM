package alak.dutta.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentTest;

import alak.dutta.utilities.ExcelReader;


public class TestBase {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public static WebDriverWait wait;
	//public ExtentReports reports = ExtentManager.getInstance();
	public static ExtentTest test;

	@BeforeSuite
	public void setUp() {
		if (driver == null) {

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			try {
				config.load(fis);
				log.debug("config file loaded!!!");

			} catch (IOException e) {

				e.printStackTrace();
			}

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\or.properties");
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			try {
				or.load(fis);
				log.debug("or file loaded!!!");
			} catch (IOException e) {

				e.printStackTrace();
			}

			if (config.getProperty("browser").equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
				driver = new FirefoxDriver();

			}
			if (config.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
				driver = new ChromeDriver();
				log.debug("chrome file loaded!!!");
			} else if (config.getProperty("browser").equals("ie")) {
				System.setProperty("webdriver.ie.driver", "driver//IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}

			driver.get(config.getProperty("url"));

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),
					TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, 15);

		}
	}

	// key word

	public void click(String locator) {
		if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(or.getProperty(locator))).click();
		} else if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(or.getProperty(locator))).click();
		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(or.getProperty(locator))).click();
		}

		else if (locator.endsWith("_NAME")) {
			driver.findElement(By.name(or.getProperty(locator))).click();
		} else if (locator.endsWith("_LINKTEXT")) {
			driver.findElement(By.linkText(or.getProperty(locator))).click();
		}

	}

	// Table Properties
	static List<WebElement> row;

	public void tab(String locator, String locator2) {
		if (locator.endsWith("_CSS")) {
			driver.findElement(By.cssSelector(or.getProperty(locator)));
			row = driver.findElements(By.tagName(or.getProperty(locator2)));

			for (WebElement e : row) {
				String actual = e.getText();
				System.out.println(actual);
			}

		} else if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(or.getProperty(locator)));
			row = driver.findElements(By.tagName(or.getProperty(locator2)));

			for (WebElement e : row) {
				String actual = e.getText();
				System.out.println(actual);
			}
		} else if (locator.endsWith("_NAME")) {
			driver.findElement(By.name(or.getProperty(locator)));
			row = driver.findElements(By.tagName(or.getProperty(locator2)));

			for (WebElement e : row) {
				String actual = e.getText();
				System.out.println(actual);
			}
		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(or.getProperty(locator)));
			row = driver.findElements(By.tagName(or.getProperty(locator2)));

			for (WebElement e : row) {
				String actual = e.getText();
				System.out.println(actual);
			}
		}
	}

	// type Method

	public void type(String locator, String value) {
		if (locator.endsWith("_CSS")) {

			driver.findElement(By.cssSelector(or.getProperty(locator))).sendKeys(value);

		} else if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(or.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_NAME")) {
			driver.findElement(By.name(or.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(or.getProperty(locator))).sendKeys(value);
		}
	}

	// Select Method

	static WebElement dropdown;

	public void select(String locator, String value) {
		if (locator.endsWith("_CSS")) {
			dropdown = driver.findElement(By.cssSelector(or.getProperty(locator)));
		} else if (locator.endsWith("_XPATH")) {
			dropdown = driver.findElement(By.xpath(or.getProperty(locator)));
		} else if (locator.endsWith("_NAME")) {
			dropdown = driver.findElement(By.name(or.getProperty(locator)));
		} else if (locator.endsWith("_ID")) {
			dropdown = driver.findElement(By.id(or.getProperty(locator)));
		}

		Select select = new Select(dropdown);
		select.selectByVisibleText(value);

	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	@AfterSuite
	public void tearDown() {

		if (driver != null) {
			driver.quit();

		}

	}
}
