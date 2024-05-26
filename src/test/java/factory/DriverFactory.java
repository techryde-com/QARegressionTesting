package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {
	static WebDriver driver = null;

	public static void initializeBrowser(String browserName) {

		if (browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		} else if (browserName.equals("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--disable-notifications");
			driver = new FirefoxDriver(options);

		} else if (browserName.equals("edge")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("--disable-notifications");
			driver = new EdgeDriver(options);
		} else if (browserName.equals("safari")) {

			driver = new SafariDriver();
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}

}

