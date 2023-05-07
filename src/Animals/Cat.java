package Animals;

public class Cat extends Animal{
    String name = "Kicia Micia";

    @Override
    public void voice() {
        System.out.println("Miau Miau!");
        sayHello();
        System.out.println("No. of legs: " + legs);
    }
}
