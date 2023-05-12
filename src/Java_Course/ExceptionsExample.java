package Java_Course;

import Java_Course.HomeWork_WebDriver.ChromeDriver;
import Java_Course.HomeWork_WebDriver.FirefoxDriver;
import Java_Course.HomeWork_WebDriver.WebDriver;

public class ExceptionsExample {
    public static void main(String[] args) {
        /*int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 3;

        for (int i=0; i <= numbers.length; i++) { //'i' nie moze byc <= poniewaz rzeczywisty rozmiar tablicy to 3
                                                //,a tzreci element nie istnieje
            System.out.println(numbers[i]);
        }*/

        WebDriver driver = getDriver("firefoxaa");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }

        private static WebDriver getDriver(String name){ //Logika metody getDriver()
            if (name.equals("chrome")) {
                return new ChromeDriver();
            } else if (name.equals("firefox")) {
                return new FirefoxDriver();
            }
            return null;
    }
}
