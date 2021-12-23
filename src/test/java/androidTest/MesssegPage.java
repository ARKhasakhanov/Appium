package androidTest;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static io.appium.java_client.touch.offset.PointOption.point;

public class MesssegPage {
    public WebDriver driver;
    public MesssegPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath=  "//android.widget.FrameLayout[@content-desc=\"Messenger\"]/android.widget.ImageView")
    private WebElement SMSButton;

    @FindBy(xpath=  "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    private WebElement clickMeMesseg;


//    @FindBy(id=  "com.vkontakte.android:id/action_download")
//    private WebElement downloud;

    @FindBy(xpath=  "//android.widget.LinearLayout[@content-desc=\"Save to device\"]")
    private WebElement downloud;


//    Даем разрешение на скачивание
    @FindBy(  id=  "android:id/button1")
    private WebElement downloadPermission;

    @FindBy( xpath=  "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")
    private WebElement confirmDownloadPermission;

//    Прикрепляем картинку
    @FindBy(  id=  "com.vkontakte.android:id/writebar_attach")
    private WebElement addPicture;
//  Выбор картинки
    @FindBy( xpath =  "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")
    private WebElement imageSelection;

    @FindBy( id =  "com.vkontakte.android:id/writebar_send")
    private WebElement sendMessage;

//    @FindBy( id =  "com.vkontakte.android:id/action_delete")
//    private WebElement deleteMesseg;

    @FindBy( xpath =  "//android.widget.LinearLayout[@content-desc=\"Delete\"]")
    private WebElement deleteMesseg;

    @FindBy( id =  "android:id/button1")
    private WebElement confirmationDelete;

    @FindBy( xpath =  "//android.widget.ImageButton[@content-desc=\"Close screen\"]")
    private WebElement exitFavorite;



//    @FindBy(id = "com.vkontakte.android:id/email_or_phone")
//    private WebElement loginInput;
//
//    @FindBy(id = "com.vkontakte.android:id/vk_password")
//    private WebElement passwdBtn;
//
//
//    @FindBy(id = "com.vkontakte.android:id/continue_btn")
//    private WebElement vhodBtn;


    public void clickSMS() {
        SMSButton.click();
    }

    public void clickFavoriteMesseger() {
        clickMeMesseg.click();
    }

    public void clickMeessegForHerSetting(WebDriver driver) {
//        new TouchAction( (AndroidDriver) driver)
//                .press(point(114, 1520))
////                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                .moveTo(point(316, 1524))
//                .release()
//                .perform();
        new TouchAction((AndroidDriver)driver).tap(point(254, 1508)).perform();
    }

    public void clickDownloud() {
        downloud.click();
    }


    public void clickDownloadPermission() {
        downloadPermission.click();
    }


    public void clickConfirmDownloadPermission() throws InterruptedException {
//        confirmDownloadPermission.click();

//        new TouchAction( (AndroidDriver) driver)
//                .press(point(371, 1521))
////                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                .moveTo(point(548, 1525))
//                .release()
//                .perform();
        Thread.sleep(2000);
        new TouchAction((AndroidDriver)driver)
                .tap(point(371, 1363))
                .perform();
    }



    public void clickAddPicture() {
        addPicture.click();
    }


    public void clickImageSelection() {
        imageSelection.click();
    }

    //  Отправить выбранный файл
    public void sendSelectedFile() {
//        new TouchAction( (AndroidDriver) driver)
//                .press(point(445, 2047))
////                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
//                .moveTo(point(166, 1440))
//                .release()
//                .perform();
        new TouchAction((AndroidDriver)driver)
                .tap(point(512, 2100))
                .perform();
    }


    public void clickSendMessage() {
        sendMessage.click();
//
    }



    public void clickDeleteMesseg() {
        deleteMesseg.click();
    }


    public void clickConfirmationDelete() {
        confirmationDelete.click();
    }


    public void clickExitFavorite() {
        exitFavorite.click();
    }




}
