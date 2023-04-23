public class instrukcja_Switch {
    public static void main(String[] args) {

        String danieKlienta = "Kawa";

        switch (danieKlienta) {
            case "Kawa":
                System.out.println("Cena: 15zl");
                break;
            case "Kanapka":
                System.out.println("Cena: 22zl");
                break;
            default:
                System.out.println("Brak danie w karcie.");
        }

    }
}
