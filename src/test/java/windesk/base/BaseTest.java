package windesk.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import windesk.reports.ExtentTestReports;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest extends ExtentTestReports {
    static AppiumDriver appiumDriver = null;

    public static WebDriverWait wait;


    @BeforeTest
    public void setup() {
        try {
            DesiredCapabilities capabilities;
            capabilities = new DesiredCapabilities();

            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("appPackage", "com.windesk.pppmobilev2");
            capabilities.setCapability("appActivity", "com.windesk.pppmobilev2.MainActivity");
            capabilities.setCapability("appium:skipUnlock", "true");
            capabilities.setCapability("appium:noReset", "false");


            appiumDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            wait = new WebDriverWait(appiumDriver, 10);
        } catch (MalformedURLException e) {
            System.out.println("Hatalı URL");
        }
    }

    public static AppiumDriver getAppiumDriver() {
        return appiumDriver;
    }

    public static void setAppiumDriver(AppiumDriver appiumDriver) {
        BaseTest.appiumDriver = appiumDriver;
    }

    public void tearDown() {
        getAppiumDriver().quit();
    }
}
