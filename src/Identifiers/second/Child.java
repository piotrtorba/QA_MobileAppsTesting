package Identifiers.second;

import Identifiers.first.Parent;

public class Child extends Parent {

    public void testIdentifiers() {
        System.out.println(first);
        System.out.println(second); /* Modyfikator dostepu 'default' nie bedzie dostepny jesli rodzic 'Parent' znajduje
         sie w innej paczce */
        System.out.println(third);
        System.out.println(fourth); /*'fourth' jest polem prywatnym wiec klasa potomna nawet w tej samej paczce nie  ma
        dostepu do pol 'provate'. Dostep jest mozliwy tylko w klasie w ktorej pole 'private' zostalo stworzone */
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
    }
}
