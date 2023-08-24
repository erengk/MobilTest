package windesk.constants;

import org.openqa.selenium.By;

public class Constants {
    public static final By username = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.widget.EditText[1]\n");

    public static final By password = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.widget.EditText[2]\n");

    public static final By loginButton = By.xpath("//android.widget.Button[@content-desc=\"Giriş Yap\"]\n");

    public static final By homePageButton = By.xpath("//android.view.View[@content-desc=\"AnaSayfa\"]");

    public static final By openRequests = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.view.View[3]/android.view.View/android.view.View");

    public static final By confirmationCompletion = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.view.View[4]/android.view.View/android.view.View");

    public static final By newNotification = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.view.View[5]/android.view.View/android.view.View");

    public static final By newWorkOrder = By.xpath("//android.view.View[@content-desc=\"Ankara Etlik Şehir Hastanesi\n" +
            "Yardım Masası Uygulaması\n" +
            "Vaka-(SLA) Listesi\n" +
            "Vaka-(SLA) Arama\n" +
            "İş Emri Listesi\n" +
            "İş Emri Arama\n" +
            "Yeni İş Emri\"]/android.widget.Button[5]");

    public static final By slaList = By.xpath("");

    public static final By emptyPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.view.View[2]/android.view.View/android.view.View");

    public static final By slaSearch = By.xpath("//android.view.View[@content-desc=\"Ankara Etlik Şehir Hastanesi\n" +
            "Yardım Masası Uygulaması\n" +
            "Vaka-(SLA) Listesi\n" +
            "Vaka-(SLA) Arama\n" +
            "İş Emri Listesi\n" +
            "İş Emri Arama\n" +
            "Yeni İş Emri\"]/android.widget.Button[2]");

    public static final By workOrderList = By.xpath("//android.view.View[@content-desc=\"Ankara Etlik Şehir Hastanesi\n" +
            "Yardım Masası Uygulaması\n" +
            "Vaka-(SLA) Listesi\n" +
            "Vaka-(SLA) Arama\n" +
            "İş Emri Listesi\n" +
            "İş Emri Arama\n" +
            "Yeni İş Emri\"]/android.widget.Button[3]");

    public static final By workOrderSearch = By.xpath("//android.view.View[@content-desc=\"Ankara Etlik Şehir Hastanesi\n" +
            "Yardım Masası Uygulaması\n" +
            "Vaka-(SLA) Listesi\n" +
            "Vaka-(SLA) Arama\n" +
            "İş Emri Listesi\n" +
            "İş Emri Arama\n" +
            "Yeni İş Emri\"]/android.widget.Button[4]");

    public static final By choiseAnySla = By.xpath("//android.widget.Button[@content-desc=\"SML00004548 Ret Onayı Bekliyor " +
            "1515000015 - STERİL BEKLETME T5 KADIN SAĞLIĞI ve DOĞUM HASTANESİ - F05 - C BLOK Tıbbi cihazların ameliyathaneye taşınması için " +
            "personel talep edilmektedir. Dn:112673 Açılma Tarihi: 24/09/2022 08:52:47 Hedef Yanıtlama 24/09/2022 09:52:47 Kalan Süreniz " +
            "220 gün 0 saat 17 dk. 13 sn. Hedef Düzeltme 24/09/2022 01:52:47 Kalan Süreniz 220 gün 8 saat 17 dk. 13 sn. 3 HIZMET\"]\n");

    public static final By backBtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.view.View[1]/android.widget.Button\n");

    public static final By slaEight = By.xpath("//android.view.View[@content-desc=\"8 Temizlik talebi\"]\n");
}
