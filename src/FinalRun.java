public class FinalRun {
    public static void main(String[] args) {

        final int x = 22; //Przypisanie zmiennej na stale.

        final Person osoba = new Person("Tim", 22); //Mozliwe jest modyfikowanie argumentow obiektu final
        //, ale tylko w obrebie tego obiektu.
        osoba.age = 25;
    }
}
