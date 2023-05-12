package Java_Course.HomeWork_WebDriver;

public class WebDriverSecondRun {
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirefox = new FirefoxDriver();
        WebDriver thirdFirefox = new FirefoxDriver();

        WebDriver brave = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening page with Brave");
            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with Brave");
            }
        };
        brave.get();
        brave.findElementBy();
    }
}
