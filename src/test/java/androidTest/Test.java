package androidTest;//package androidTest;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
////import org.junit.Assert;
//import org.junit.*;
////import org.junit.Test;
////import org.openqa.selenium.remote.DesiredCapabilities;
////import org.testng.annotations.*;
//
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.BeforeMethod;
////import org.testng.annotations.AfterMethod;
//
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//
//public class Test {
//    private AndroidDriver driver;
//
//    @Before
//    @org.junit.Test
//    public void setUp() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        // iPhone Simulator, iPad Simulator, iPhone Retina 4-inch, Android Emulator, Galaxy S4 и т.д.
//        // На iOS, это должно быть одно  из допустимых устройств. На Android эта возможность в настоящее время игнорируется,
//        // но параметр является обязательным
////        capabilities.setCapability("deviceName", "pixel");
//        // Имя ОС на мобильном устройстве
//        capabilities.setCapability("platformName", "Android");
//        // Версия ОС
//        capabilities.setCapability("platformVersion", "10.0");
//        // Уникальный индефикатор подключенного устройства
//        capabilities.setCapability("device", "wcztw4faeulbq4lj");
//        // Java-пакет Android приложения, которое мы хотим запустить. (APK info)
//        capabilities.setCapability("appPackage", "com.miui.calculator");
//        // Имя activity которые мы хотим запустить из пакета, указанного выше. (APK info)
//        capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
//
//        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//    }
//
////    @org.junit.Test
////    public void testAddition() {
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
////    }
////
////    @After
////    public void teardown() {
////        driver.quit();
////    }
//}
////org.openqa.selenium.SessionNotCreatedException: Unable to create a new remote session. Please check the server log for more details. Original error: An unknown server-side error
////        occurred while processing the command. Original error: Error executing adbExec. Original error: 'Command 'C:\\Users\\KP\\AppData\\Local\\Android\\Sdk\\platform-tools\\adb.exe -P 5037
////        -s wcztw4faeulbq4lj shell 'settings delete global hidden_api_policy_pre_p_apps;settings delete global hidden_api_policy_p_apps;settings delete global hidden_api_policy''
////        exited with code 255'; Stderr: 'Security exception: Permission denial: writing to settings requires:android.permission.WRITE_SECURE_SETTINGS
