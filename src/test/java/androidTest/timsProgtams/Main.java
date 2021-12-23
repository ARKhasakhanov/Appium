package androidTest.timsProgtams;

import io.appium.java_client.android.AndroidDriver;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    private DesiredCapabilities capabilities;
    private AndroidDriver driver;

    public static void main(String[] args) throws JSONException, MalformedURLException, InterruptedException {
//        Main main = new Main();
//        main.setAndroidCapabilities();
        BaseTest baseTest = new BaseTest();
        baseTest.setAndroidCapabilities();
    }

    private void setAndroidCapabilities() throws JSONException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        this.capabilities = new DesiredCapabilities();
        JSONObject appiumJson = JSONService.readJsonFromFile(("src/test/java/androidTest/timsProgtams/androidSim.json"));
        JSONObject capabilitiesJSON = JSONService.getCapabilities(appiumJson);

        // Имя ОС на мобильном устройстве
        capabilities.setCapability("platformName", capabilitiesJSON.get("platformName"));
        // Версия ОС
        capabilities.setCapability("platformVersion", capabilitiesJSON.get("platformVersion"));
        // Уникальный индефикатор подключенного устройства
        capabilities.setCapability("device", capabilitiesJSON.get("device"));
        // Java-пакет Android приложения, которое мы хотим запустить. (APK info)
        capabilities.setCapability("appPackage", capabilitiesJSON.get("appPackage"));
        // Имя activity которые мы хотим запустить из пакета, указанного выше. (APK info)
        capabilities.setCapability("appActivity", capabilitiesJSON.get("appActivity"));


        String urlAppium = JSONService.getUrl(appiumJson);
        driver = new AndroidDriver(new URL(urlAppium), capabilities);

//        caps.keySet().forEach(keyStr -> this.capabilities.setCapability(keyStr, caps.get(keyStr)));
//        try {
//            this.driver = new AndroidDriver<MobileElement>(new URL(JSONService.getUrl(appiumJson)), this.capabilities);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
