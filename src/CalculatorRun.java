import java.util.Scanner;

public class CalculatorRun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator wynik = new Calculator();

        System.out.println("Aby wykonac dzialania na liczbach prosze podac pierwsza liczbe: ");
        int usrNumber_1 = scanner.nextInt();
        System.out.println("Prosze podac druga liczbe: ");
        int usrNumber_2 = scanner.nextInt();

        System.out.println("Wynik dodawania to: " + wynik.dodawanie(usrNumber_1, usrNumber_2));
        System.out.println("Wynik odejmowania to: " + wynik.odejmowanie(usrNumber_1, usrNumber_2));
        System.out.println("Wynik mnozenia to: " + wynik.mnozenie(usrNumber_1, usrNumber_2));
        System.out.println("Wynik dzielenia to: " + wynik.dzielenie(usrNumber_1, usrNumber_2));
        System.out.println("Wynik dzielenia modulo to: " + wynik.modulo(usrNumber_1, usrNumber_2));

    }
}
