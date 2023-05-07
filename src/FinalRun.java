public class FinalRun {
    public static void main(String[] args) {

        final int x = 22; //Przypisanie zmiennej na stale.

        final Person osoba = new Person("Tim", 22); //Mozliwe jest modyfikowanie argumentow obiektu final
        //, ale tylko w obrebie tego obiektu. Nie da sie stworzyc drugiego takiego obiektu, nadpisac go.
        osoba.age = 25;
    }
}
