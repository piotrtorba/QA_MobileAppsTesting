package Identifiers.first;

public class Parent {

    public String first = "public";
    String second = "default";
    protected String third = "protected";
    private String fourth = "Private";

    public void  firstMethod() {
        System.out.println("Public");
    }
    public void  secondMethod() {
        System.out.println("Default");
    }
    public void  thirdMethod() {
        System.out.println("Protected");
    }
    public void  fourthMethod() {
        System.out.println("Private");
    }
    public void testIdentifiers() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}
