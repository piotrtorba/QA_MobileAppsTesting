package Java_Course;

import Java_Course.HomeWork_WebDriver.FirefoxDriver;
import Java_Course.HomeWork_WebDriver.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {
        int a = 2;
        double b = 4.23;

        double c = a/b; // 'a' zostaje porzekonwertowane do 'double'

        int d = a/(int)b;
        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver; //Konwersja obiektu
        firefoxDriver.get();
    }
}
