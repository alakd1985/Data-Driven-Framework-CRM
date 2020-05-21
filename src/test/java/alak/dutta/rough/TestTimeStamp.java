package alak.dutta.rough;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class TestTimeStamp {
public static void main(String[] args) throws InterruptedException {
	Date d = new Date();
	System.out.println(d);
	String screenshotName= d.toString().replace(" : ", "_").replace(" ", " _ ");
	System.out.println(screenshotName);
	WebDriver driver;

}
}
