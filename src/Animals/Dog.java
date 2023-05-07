package Animals;

public class Dog extends Animal {
    public String name = "Burek";

    @Override
    public void voice() {
        System.out.println("Hau Hau!");
        sayHello();
        System.out.println("No. of legs: " + legs);
    }
}
