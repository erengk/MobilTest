package windesk.test;

import org.testng.annotations.*;
import windesk.base.BaseTest;
import windesk.page.LoginPage;
import windesk.reports.ExtentTestReports;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @BeforeSuite
    public void setupSuite(){
        ExtentTestReports.beforeTest();
    }

    @AfterSuite
    public void afterSuite(){
        ExtentTestReports.afterTest();
    }

    @BeforeClass
    public void before(){
        loginPage = new LoginPage(getAppiumDriver());
    }

    @Test
    public void test() throws InterruptedException {
        loginPage.loginClick();
    }

    @AfterClass
    public void after(){
        tearDown();
    }
}
