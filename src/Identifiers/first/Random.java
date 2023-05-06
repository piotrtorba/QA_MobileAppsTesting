package Identifiers.first;

public class Random {
    /* Dostep do pol i metod poprzez obiekt klasy 'Parent' zachowuje podobne wlasciwosci jednak poprzez dostep przez
    * obiekt nie ma tez dostepu do pola 'protected' */

    public void testIdentifier() {
        Parent obiektKlasyParent = new Parent();
        System.out.println(obiektKlasyParent.first);
        System.out.println(obiektKlasyParent.second);
        System.out.println(obiektKlasyParent.third);
        System.out.println(obiektKlasyParent.fourth);
        obiektKlasyParent.firstMethod();
        obiektKlasyParent.secondMethod();
        obiektKlasyParent.thirdMethod();
        obiektKlasyParent.fourthMethod();
    }

}
