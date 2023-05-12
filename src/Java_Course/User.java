package Java_Course;

public class User {

    public String username;
    public String password;

    public User() {

    }
    public User(String login, String pass) {
        this.username = login;
        this.password = pass;
        System.out.println("Hello z konstruktora");
    }

    public void sayHello() {
        System.out.println("Hello my name is: " + username);
    }
}
