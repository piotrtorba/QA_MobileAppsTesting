package Java_Course.Animals;

public class AnimalRun {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.voice();
        dog.sayHello();

        Animal cat = new Cat();
        cat.voice();
        cat.sayHello();

    }
}
