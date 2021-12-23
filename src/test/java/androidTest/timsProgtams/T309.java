package androidTest.timsProgtams;//package androidTest.timsProgtams;
//
//import com.appiumtests.mysub.models.User;
//import com.appiumtests.mysub.tests.BaseTest;
//import com.appiumtests.mysub.tools.Retry;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Optional;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//public class T309 extends BaseTest {
//
//    @BeforeMethod
//    @Parameters("userJSONFile")
//    public void initUser(@Optional("00000060015") String userJSONFile) {
//        user = new User().init(userJSONFile);
//    }
//
//    @Test(retryAnalyzer = Retry.class, testName = "")
//    public void t309() {
//        auth().clickToEnterViaESIAButton();
//        auth().authAs(user);
//        org().selectPerson(user);
//    }
//}