package androidTest.timsProgtams;//package androidTest.timsProgtams;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import io.appium.java_client.pagefactory.iOSXCUITFindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class BaseScreen {
//
//    protected AppiumDriver driver;
//
//    public BaseScreen(AppiumDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//    }
//
//    protected void clickTo(MobileElement element) {
//        new WebDriverWait(driver, Configuration.TIMEOUTS).until(ExpectedConditions.elementToBeClickable(element)).click();
//    }
//
//    protected void sendTextTo(MobileElement element, String text) {
//        element.clear();
//        element.sendKeys(text);
//    }
//
//    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`label == \"Allow\"`]")
//    private MobileElement push;
//
//    protected void checkPush() {
//        if (push.isDisplayed()) {
//            push.click();
//        }
//    }
//
//}