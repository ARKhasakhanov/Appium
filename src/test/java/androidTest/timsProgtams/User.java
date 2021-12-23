package androidTest.timsProgtams;//package androidTest.timsProgtams;
//
//import com.google.gson.Gson;
//import com.google.gson.annotations.SerializedName;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.List;
//
//public class User {
//
//    @SerializedName("login")
//    private String userLogin;
//
//    @SerializedName("password")
//    private String userPassword;
//
//    @SerializedName("pin")
//    private String userPinCode;
//
//    @SerializedName("userName")
//    private String userName;
//
//    @SerializedName("organizations")
//    private List<UserOrg> organizations;
//
//    public User() {
//
//    }
//
//    public User init(String userJSONFile) {
//        String path = "src/test/resources/users/" + userJSONFile + ".json";
//        User user = null;
//        try {
//            user = new Gson().fromJson(new FileReader(path), User.class);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        return user;
//    }
//
//    public String getUserLogin() {
//        return userLogin;
//    }
//
//    public String getUserPassword() {
//        return userPassword;
//    }
//
//    public String getUserPinCode() {
//        return userPinCode;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public List<UserOrg> getOrganizations() {
//        return organizations;
//    }
//
//    public void setUserLogin(String userLogin) {
//        this.userLogin = userLogin;
//    }
//
//    public void setUserPassword(String userPassword) {
//        this.userPassword = userPassword;
//    }
//
//    public void setUserPinCode(String userPinCode) {
//        this.userPinCode = userPinCode;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public void setOrganizations(List<UserOrg> organizations) {
//        this.organizations = organizations;
//    }
//
//    @Override
//    public String toString() {
//        return new Gson().toJson(this, User.class);
//    }
//}
