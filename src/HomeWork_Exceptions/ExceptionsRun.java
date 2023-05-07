package HomeWork_Exceptions;

import java.util.Scanner;

public class ExceptionsRun {
    public static void main(String[] args) throws InvalidAgeException {

        System.out.println("Podaj swoj wiek: ");
        Scanner userInput = new Scanner(System.in);
        int userAge = userInput.nextInt();

        if(userAge < 1) {
            throw new InvalidAgeException("Age cannot be lower than 1");
        } else if (userAge < 18 && userAge > 0) {
            System.out.println("NIE jestes pelnoletni.");
        } else {
            System.out.println("Gratulacje! jestes pelnoletni.");
        }
    }
}
