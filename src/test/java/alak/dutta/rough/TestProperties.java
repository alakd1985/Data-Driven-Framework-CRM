package alak.dutta.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) throws IOException {
		// to read the properties file we need Properties
		// to get the location of the config file press alt+enter
		System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		Properties or = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\config.properties");
		FileInputStream fis1 = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\or.properties");
		config.load(fis);
		or.load(fis1);
		System.out.println(config.getProperty("browser"));
		System.out.println(or.getProperty("bmlBtn"));
	}
}
