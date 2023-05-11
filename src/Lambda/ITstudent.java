package Lambda;

public class ITstudent implements Student {

    @Override
    public void sayHello(String name) {
        System.out.println("I am the IT student.");
        System.out.println("My name is " + name);
    }
}
