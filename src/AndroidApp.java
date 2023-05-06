public class AndroidApp extends App {

    public AndroidApp(String name) {
        super(name);
        this.name = name;
    }

    public void runAndriodApp() {
        System.out.println("I'm the app running on Android. My name is " + name);
    }
}
