public class MathTeacher extends Person {
    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    //Test comment

    public void teach() {
        System.out.println("Im teaching Math");
    }
    public void sayHello() {
        System.out.println("Hi! My name is... My name is ..." + name);
        System.out.println("I'm " + age + " yrs old");
        System.out.println("I teach in " + school);
    }
}
