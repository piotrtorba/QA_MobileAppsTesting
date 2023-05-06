public class PersonRun {
    public static void main(String[] args) {
        MathTeacher teacher1 = new MathTeacher("Slim Shady", 25, "Merito");
        /*teacher1.name = "Slim Shady";
        teacher1.age = 25;
        teacher1.school = "Merito"; sposob przypisania danych bez uzycia konstruktora */
        teacher1.walk();
        teacher1.eat();
        teacher1.teach();
        teacher1.sayHello();

        Footballer footballer1 = new Footballer("Mike", 21, "FC Bobo");
        /*footballer1.name = "Mike";
        footballer1.age = 21;
        footballer1.club = "FC Bobo"; sposob przypisania danych bez uzycia konstruktora */
        footballer1.walk();
        footballer1.eat();
        footballer1.play();
        footballer1.sayHello();
    }
}
