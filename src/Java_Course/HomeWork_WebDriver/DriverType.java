package Java_Course.HomeWork_WebDriver;

public enum DriverType {
    CHROME("chrome", "/src/res/chromedriver.exe"),
    FIREFOX("firefox", "/src/res/firefoxdriver.exe");

    String name;
    String path;
    private DriverType(String name, String path) {
        this.name = name;
        this.path = path;
    }
}
