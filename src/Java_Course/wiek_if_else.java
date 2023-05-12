package Java_Course;

import java.util.Scanner;

public class wiek_if_else {
    public static void main(String[] args) {
        System.out.println("Podaj swoj wiek: 1");
        Scanner userInput = new Scanner(System.in);
            int userAge = userInput.nextInt();

            if (userAge < 18) {
            System.out.println("Przepraszam, mlodzierzy alkoholi nie sprzedajemy!");
        } else {
            System.out.println("Dziekujemy za zakupy.");
        }
    }
}
