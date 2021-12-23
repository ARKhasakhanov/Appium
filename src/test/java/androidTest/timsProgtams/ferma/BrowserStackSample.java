package androidTest.timsProgtams.ferma;//package androidTest.timsProgtams.ferma;
//import java.net.URL;
//import java.util.List;
//import java.util.function.Function;
//import java.net.MalformedURLException;
//
//import androidTest.ConfProperties;
//import io.appium.java_client.MobileBy;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//public class BrowserStackSample {
//    public static void main(String[] args) throws MalformedURLException, InterruptedException {
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//
//        // Set your access credentials
//        caps.setCapability("browserstack.user", ConfProperties.getProperty("browserstack.user"));
//        caps.setCapability("browserstack.key", ConfProperties.getProperty("browserstack.key"));
//
//        // Set URL of the application under test
//        caps.setCapability("app", "bs://b323db93fec2e688d8c46b932b2e0ba1d9beb6fd");
//
//        // Specify device and os_version for testing
//        caps.setCapability("device", "Google Pixel 4");
//        caps.setCapability("os_version", "10.0");
//
//        // Set other BrowserStack capabilities
//        caps.setCapability("project", "First Java Ferrm Mobail Test");
//        caps.setCapability("build", "browserstack-build-1");
//        caps.setCapability("name", "vk test");
//
//
//        // Initialise the remote Webdriver using BrowserStack remote URL
//        // and desired capabilities defined above
//        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
//                new URL("http://hub.browserstack.com/wd/hub"), caps);
//
//        // Write your test case statements here
//
//        // Invoke driver.quit() after the test is done to indicate that the test is completed.
//        driver.quit();
//
//    }
//}