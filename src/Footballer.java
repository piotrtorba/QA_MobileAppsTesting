public class Footballer extends Person {
    public String club;

    public Footballer(String name, int age, String club) {
        super(name, age);
        this.club = club;
    }

    public void play() {
        System.out.println("I play football");
    }
    public void sayHello() {
        System.out.println("Hi! My name is... My name is ..." + name);
        System.out.println("I'm " + age + " yrs old");
        System.out.println("I play in " + club);
    }
}
