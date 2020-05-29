package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.selenium.utilities.CommonMethods;
import com.selenium.utilities.ExtentManager;
//import com.selenium.utilities.ReadingExcel;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driver;

	public static Properties config = new Properties();

	public static Properties OR = new Properties();

	public static FileInputStream fis;

	// public static ExcelReader excel = new
	// ReadingExcel(System.getProperty("user.dir") +
	// "\\src\\test\\resources\\excel\\testdata.xlsx");

	public static Logger log = Logger.getLogger(BasePage.class.getName());

	public static WebDriverWait wait;

	public ExtentReports rep = ExtentManager.createInstance(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\extent.html");

	public static ExtentTest test;

	public BasePage() {

		if (driver == null) {

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// FIXME Auto-generated catch block
				e.printStackTrace();
			}

			try {
				config.load(fis);
			} catch (IOException e1) {
				// FIXME Auto-generated catch block
				e1.printStackTrace();
			}

			log.info("Logging into the application");

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			} catch (FileNotFoundException e) {
				// FIXME Auto-generated catch block
				e.printStackTrace();
			}

			try {
				OR.load(fis);
			} catch (IOException e) {
				// FIXME Auto-generated catch block
				e.printStackTrace();
			}

			if (config.getProperty("browser").equals("firefox")) {

				WebDriverManager.firefoxdriver().setup();

				driver = new FirefoxDriver();

				log.info("Launching Firefox browser");

			} else if (config.getProperty("browser").equals("chrome")) {

				WebDriverManager.chromedriver().setup();

				driver = new ChromeDriver();

				log.info("Launching Chrome Browser Sucessfully");
			}

			ChromeOptions options = new ChromeOptions();

			options.addArguments("--disable-notifications");

			options.addArguments("--disable-infobars");

			driver.get(config.getProperty("testsiteurl"));

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

	}

	public static void verifyEquals(String Expected, String Actual) {

		try {
			
			Assert.assertEquals(Actual, Expected);

			// assert.assertEquals(Actual, Expected);
		} catch (Throwable t) {

			CommonMethods.captureScreenshot();

		}
	}

	public static void quit() {
		
		driver.quit();
	}
}


