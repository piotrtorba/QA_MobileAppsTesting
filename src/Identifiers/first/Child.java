package Identifiers.first;

public class Child extends Parent {
    @Override
    public void testIdentifier() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth); /*'fourth' jest polem prywatnym wiec klasa potomna nawet w tej samej paczce nie  ma
        dostepu do pol 'provate'. Dostep jest mozliwy tylko w klasie w ktorej pole 'private' zostalo stworzone */
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}
