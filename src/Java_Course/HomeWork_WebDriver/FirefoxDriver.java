package Java_Course.HomeWork_WebDriver;

public class FirefoxDriver implements WebDriver {
    @Override
    public void get() {
        System.out.println("I'm loading Firefox web browser...");

    }

    @Override
    public void findElementBy() {
        System.out.println("Searching for element by using Firefox");

    }
}
