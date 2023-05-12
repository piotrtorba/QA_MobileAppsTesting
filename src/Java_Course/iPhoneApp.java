package Java_Course;

public class iPhoneApp extends App {

    public iPhoneApp(String name) {
        super(name);
        this.name = name;
    }

    public void runIphoneApp() {
        System.out.println("I'm the app running on iPhone.My name is " + name);
    }
}
