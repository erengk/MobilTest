package windesk.page;

import io.appium.java_client.AppiumDriver;
import windesk.base.BasePage;
import static windesk.constants.Constants.*;

public class LoginPage extends BasePage {

    AppiumDriver driver;
    public LoginPage(AppiumDriver driver){
        super(driver);
    }

    public LoginPage loginClick() throws InterruptedException {
        click(username);
        sendKeys(username,"Sgnm1001");
        click(password);
        sendKeys(password,"..WinSgnm99!!");
        click(loginButton);
        Thread.sleep(1000);
        infoLog("Login butonuna tıklandı");
        Thread.sleep(2000);
        click(slaSearch);
        Thread.sleep(2000);
        click(emptyPage);
        return this;
    }

    public LoginPage slaListPage() throws InterruptedException {
        Thread.sleep(2000);
        click(slaList);
        infoLog("SLA Liste butonuna tıklandı");
        Thread.sleep(2000);
        click(emptyPage);
        Thread.sleep(2000);
        click(choiseAnySla);
        passLog("SLA seçilerek görüntülendi");
        Thread.sleep(2000);
        click(slaSearch);
        Thread.sleep(2000);
        click(emptyPage);
        return this;
    }

    public LoginPage slaSearchPage() throws InterruptedException {
        Thread.sleep(2000);
        click(slaSearch);
        infoLog("SLA Arama butonuna tıklandı");
        Thread.sleep(2000);
        click(slaEight);
        passLog("SLA konusu seçildi");
        Thread.sleep(2000);
        return this;
    }
}
