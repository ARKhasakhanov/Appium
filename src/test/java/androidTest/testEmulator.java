package androidTest;//package androidTest;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//import io.appium.java_client.PerformsTouchActions;
//import io.appium.java_client.TouchAction;
//import io.appium.java_client.touch.WaitOptions;
//import io.appium.java_client.touch.offset.PointOption;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import org.testng.annotations.Test;
//
//public class testEmulator {
//    private AndroidDriver driver;
//
//    @BeforeMethod
//    public void setUp() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        // iPhone Simulator, iPad Simulator, iPhone Retina 4-inch, Android Emulator, Galaxy S4 и т.д.
//        // На iOS, это должно быть одно  из допустимых устройств. На Android эта возможность в настоящее время игнорируется,
//        // но параметр является обязательным
//        capabilities.setCapability("deviceName", "pixel");
//        // Имя ОС на мобильном устройстве
//        capabilities.setCapability("platformName", "Android");
//        // Версия ОС
//        capabilities.setCapability("platformVersion", "9.0");
//        // Уникальный индефикатор подключенного устройства
//        capabilities.setCapability("udid", "emulator-5554");
//        // Java-пакет Android приложения, которое мы хотим запустить. (APK info)
//        capabilities.setCapability("appPackage", "com.vkontakte.android");
//        // Имя activity которые мы хотим запустить из пакета, указанного выше. (APK info)
//        capabilities.setCapability("appActivity", "com.vkontakte.android.MainActivity");
//
////        capabilities.setCapability("appPackage", "com.android.calculator2");
////        // Имя activity которые мы хотим запустить из пакета, указанного выше. (APK info)
////        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
//
//
////        System.out.println(capabilities.toString());
//        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
////        System.out.println(capabilities.toString());
//    }
//
//    @Test
//    public void testAddition() throws InterruptedException {
////        MobileElement buttonTwo = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
////        buttonTwo.click();
////
////        driver.findElementById("com.android.calculator2:id/op_add").click();
////
////        driver.findElementById("com.android.calculator2:id/digit_3").click();
////
////        MobileElement results = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
////
////        Assert.assertEquals("5", results.getText(), "Result should be equals 5");
////        MobileElement el1 = (MobileElement) driver.findElementById("com.vkontakte.android:id/login_button");
////        el1.click();
////        driver.navigate().back();
////        MobileElement el2 = (MobileElement) driver.findElementById("com.vkontakte.android:id/vk_password");
////        el2.click();
//
////
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        MobileElement el1 = (MobileElement) driver.findElementById("com.vkontakte.android:id/login_button");
//        el1.click();
//
////        driver.navigate().back();
//        driver.findElementById("com.google.android.gms:id/cancel").click();
////        el999.click();
//        MobileElement el2 = (MobileElement) driver.findElementById("com.vkontakte.android:id/email_or_phone");
//        el2.sendKeys("+7 (995) 095-22-34");
//        MobileElement el3 = (MobileElement) driver.findElementById("com.vkontakte.android:id/vk_password");
//        el3.sendKeys("axDsMn");
//        MobileElement el4 = (MobileElement) driver.findElementById("com.vkontakte.android:id/continue_btn");
//        el4.click();
//        MobileElement el5 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Мессенджер\"]/android.widget.ImageView");
//        el5.click();
//
//        new TouchAction(driver)
//                .press(PointOption.point(402, 1223))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                .moveTo(PointOption.point(440, 760))
//                .release().perform();
//        new TouchAction( driver)
//                .press(PointOption.point(428, 603))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                .moveTo(PointOption.point(451, 1138))
//                .release().perform();
//////        Тут должен быть скрол сообщения
////
////        nu i cho ti?
////        Thread.sleep(5000);
////        MobileElement el4_1 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Главная\"]/android.widget.ImageView");
////        el4_1.click();
//        Thread.sleep(10000);
//        MobileElement el1_1 = (MobileElement) driver.findElementByAccessibilityId("Открыть меню");
//        el1_1.click();
//        Thread.sleep(10000);
//        MobileElement el5_1 = (MobileElement) driver.findElementByAccessibilityId("Настройки");
//        el5_1.click();
//        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[7]/android.widget.TextView");
//        el6.click();
//        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.widget.TextView");
//        el7.click();
//        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.TextView");
//        el8.click();
//        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Закрыть экран");
//        el9.click();
//        new TouchAction( driver)
//                .press(PointOption.point(446, 1686))
//                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                .moveTo(PointOption.point(443, 917))
//                .release().perform();
////        тут закрываемся но перед этим скролим 2 раза
//        MobileElement el10 = (MobileElement) driver.findElementById("com.vkontakte.android:id/logout");
//        el10.click();
//        MobileElement el11 = (MobileElement) driver.findElementById("android:id/button1");
//        el11.click();
//    }
//
//    @AfterMethod
//    public void teardown() {
//        driver.quit();
//    }
//}
