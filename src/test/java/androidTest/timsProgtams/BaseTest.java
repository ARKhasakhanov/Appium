package androidTest.timsProgtams;

import androidTest.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private DesiredCapabilities capabilities;

    public static LoginPage loginPage;
    public static MesssegPage messsegPage;
    public static BlackWhileTemaPage blackWhileTemaPage;
    public static ExitAccauntPage exitAccauntPage;
    public static NotDisturbPage notDisturbPage;

    protected static AppiumDriver<MobileElement> driver;
//    protected static User user;
//
//    private AuthScreen authScreen;
//    private SelectOrgScreen selectOrgScreen;
//    private PinCodeScreen pinCodeScreen;

    @BeforeSuite
    public void setUp() throws JSONException, MalformedURLException, InterruptedException {
        switch (Configuration.PLATFORM) {
//            case IOS -> setIOSCapabilities();
            case ANDROID -> setAndroidCapabilities();
            default -> {
                throw new RuntimeException("Incorrect platform");
            }
        }
        resetApp();
    }

    public void setAndroidCapabilities() throws JSONException, MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        this.capabilities = new DesiredCapabilities();
        JSONObject appiumJson = JSONService.readJsonFromFile(("src/test/java/androidTest/timsProgtams/androidSim.json"));
        JSONObject capabilitiesJSON = JSONService.getCapabilities(appiumJson);

        capabilities.setCapability("browserstack.user", ConfProperties.getProperty("browserstack.user"));
        capabilities.setCapability("browserstack.key", ConfProperties.getProperty("browserstack.key"));

        Iterator<String> keys = capabilitiesJSON.keys();
//        Перебираем элементы в json
        while(keys.hasNext()) {
            String key = keys.next();
//            System.out.println(key+" -> "+ capabilitiesJSON.get(key));
            capabilities.setCapability(key, capabilitiesJSON.get(key));
        }

        String urlAppium = JSONService.getUrl(appiumJson);


        driver = new AndroidDriver(new URL(urlAppium), capabilities);

        int implicitlyWait = JSONService.getimplicitlyWait(appiumJson);

        driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        messsegPage = new MesssegPage(driver);
        blackWhileTemaPage = new BlackWhileTemaPage(driver);
        exitAccauntPage = new ExitAccauntPage(driver);
        notDisturbPage = new NotDisturbPage(driver);

//        Test
//        loginTest();
//        movePage();
//        blackWhileTemaTest();
//        exitAccauntTest();
    }
    @Test
    public void aloginTest() throws InterruptedException {
        //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
        //значение login/password берутся из файла настроек по аналогии с chromedriver
        //и loginpage
        //вводим логин
//        System.out.println("hi");
        loginPage.clickLogin();
//        driver.findElementById("com.google.android.gms:id/cancel").click();
////        loginPage.loginknopka();
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        //вводим пароль
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
//        Thread.sleep(5000);
    }

    @Test
    public void bmovePage() throws InterruptedException {
//        ========================================
//        Место где нужно разрешать приложения доступ к файлу
//        нажимаем кнопку прикрепить файл
//        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Прикрепить вложение");
//        el1.click();
//        id com.vkontakte.android:id/writebar_attach
//        xpath //android.widget.ImageView[@content-desc="Прикрепить вложение"]

//        Кнопка для разрешения достпу к файлу
//        MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
//        el2.click();
//        android:id/button1

//        Разрешение доступа к файловой системе
//        MobileElement el3 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//        el3.click();

//        dounlod image sms
//        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Фотография");
//        el4.click();
//        id com.vkontakte.android:id/image
//        xpath //android.view.View[@content-desc="Фотография"]

//        =========================================
////        Thread.sleep(20000);
        messsegPage.clickSMS();
//        messsegPage.clickSMS();
        messsegPage.clickFavoriteMesseger();
        messsegPage.clickMeessegForHerSetting(driver);
        messsegPage.clickDownloud();
        messsegPage.clickDownloadPermission();
        messsegPage.clickConfirmDownloadPermission();
        messsegPage.clickAddPicture();
//        messsegPage.clickDownloadPermission();
//        messsegPage.clickConfirmDownloadPermission();
        messsegPage.clickImageSelection();
        messsegPage.sendSelectedFile();
        messsegPage.clickSendMessage();
        messsegPage.clickConfirmDownloadPermission();
        messsegPage.clickDeleteMesseg();
        messsegPage.clickConfirmationDelete();
        messsegPage.clickExitFavorite();
//        loginPage.loginknopka();
//        moveAppPage.swipe(driver);
    }

    @Test
    public void bnMoveSetting() throws InterruptedException {
        blackWhileTemaPage.openMenu();
        blackWhileTemaPage.clickSetting();
    }

    @Test
    public void boNotDisturb() throws InterruptedException {
        notDisturbPage.clickNotDisturb();
        notDisturbPage.clickChooseHourDisturb();
    }

    @Test
    public void cBlackWhileTemaTest() throws InterruptedException {
        blackWhileTemaPage.clickStile();
        blackWhileTemaPage.clickBlackStile();
        Thread.sleep(5000);
        blackWhileTemaPage.clickWhileStile();
        blackWhileTemaPage.ckiclBackMenu();

    }

    @Test
    public void dexitAccauntTest() {
        exitAccauntPage.swipeMenu(driver);
        exitAccauntPage.ckiclExitAccaunt();
        exitAccauntPage.exsapt();
    }


//    private void setIOSCapabilities() {
//        this.capabilities = new DesiredCapabilities();
//        JSONObject appiumJson = JSONService.readJsonFromFile(this.getClass().getClassLoader().getResource("capabilities/androidSim.json").getPath());
//        JSONObject caps = JSONService.getCapabilities(appiumJson);
//        System.out.println(caps.toString());
//        caps.keySet().forEach(keyStr -> this.capabilities.setCapability(keyStr, caps.get(keyStr)));
//        try {
//            this.driver = new IOSDriver<MobileElement>(new URL(JSONService.getUrl(appiumJson)), this.capabilities);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        // close driver
        if (this.driver != null) {
            driver.quit();
        }
    }

    private void resetApp() {
        driver.resetApp();
    }

//    public AuthScreen auth() {
//        return Objects.requireNonNullElseGet(this.authScreen, () -> new AuthScreen(driver));
//    }
//
//    public SelectOrgScreen org() {
//        return Objects.requireNonNullElseGet(this.selectOrgScreen, () -> new SelectOrgScreen(driver));
//    }
//
//    public PinCodeScreen pin() {
//        return Objects.requireNonNullElseGet(this.pinCodeScreen, () -> new PinCodeScreen(driver));
//    }
}
