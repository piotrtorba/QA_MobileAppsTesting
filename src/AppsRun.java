public class AppsRun {
    public static void main(String[] args) {

        AndroidApp mailAndroidApp = new AndroidApp("Mail Android App.");
        mailAndroidApp.appInfo();
        mailAndroidApp.runAndriodApp();

        iPhoneApp mialIphoneApp = new iPhoneApp("Mail iPhone App");
        mialIphoneApp.appInfo();
        mialIphoneApp.runIphoneApp();
    }
}
