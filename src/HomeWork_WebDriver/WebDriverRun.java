package HomeWork_WebDriver;

public class WebDriverRun {
    public static void main(String[] args) throws NoValidBrowserName {

        /*Inny sposob zakodowania 'InterfaceRun' wykozystujacy polimorfizm i zmniejszajacy ilosc kodu*/

        DriverType[] driverTypes = DriverType.values();
        for (int i=0; i<driverTypes.length; i++) {
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        WebDriver driver = getDriver(DriverType.CHROME); /*Wywolanie jakby zmiennej 'driver', ktora jest metoda getDriver
         z argumentem, z koleji ktora implementuje metody z Interfejsu 'WebDriver'*/
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }
    private static WebDriver getDriver(DriverType type) throws NoValidBrowserName { //Logika metody getDriver()
        if(type.name.equals("chrome")) { //Porownanie argumentu 'type' z wartoscia zadeklarowanym w 'Enum' DriverType.
            System.out.println(type.path);
            return new ChromeDriver();
        } else if (type.name.equals("firefox")) {
            System.out.println(type.path);
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
