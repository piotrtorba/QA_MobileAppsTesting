public class Metody {

    /*public void policzWynik() {
        System.out.println("Obliczanie trwa...");
        int wynik = 0;
        for (int i = 0; i < 100; i++) {
            wynik = wynik + i;
        }*/
        public int pobierzWynik() {
            System.out.println("Obliczanie trwa...");
            int wynik = 0;
            for (int i = 0; i < 100; i++) {
                wynik = wynik + i;
            }
            System.out.println("Wynik obliczen to: " + wynik);
            return wynik;
        }
}
