package HomeWork_WebDriver;

public class InterfaceRun {
    public static void main(String[] args) throws NoValidBrowserName {

        /*Inny sposob zakodowania 'InterfaceRun' wykozystujacy polimorfizm i zmniejszajacy ilosc kodu*/

        WebDriver driver = getDriver("firefoxx"); /*Wywolanie jakby zmiennej 'driver', ktora jest metoda getDriver
         z argumentem, z koleji ktora implementuje metody z Interfejsu 'WebDriver'*/
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }
    private static WebDriver getDriver(String name) throws NoValidBrowserName { //Logika metody getDriver()
        if(name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("No valid browser name!");

        /* -------------- Stary sposob --------------
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get();
        chromeDriver.findElementBy();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();*/
    }
}
