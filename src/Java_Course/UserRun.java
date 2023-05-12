package Java_Course;

public class UserRun {
    public static void main(String[] args) {
        User user = new User("Bartek", "Hello");
        System.out.println("Your username is : " + user.username);
        System.out.println("Your password is : " + user.password);

    //    user.username = "Piotr";
    //    user.password = "abc123";
        user.sayHello();

    }
}
