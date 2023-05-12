package Java_Course.ExamplePalindrom;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Podaj jakies slowo: "); //Scanner is an additional fuctionality.
        Scanner userInput = new Scanner(System.in);
        System.out.println(isPalindrom(userInput.nextLine()));

    }
    public  static boolean isPalindrom(String userWord) {
        int wordLength = userWord.length();
        for (int i=0; i<(wordLength/2); i++) {
            if (userWord.charAt(i) != userWord.charAt(wordLength-i-1)) {
                System.out.println("Slowo: '" + userWord + "' nie jest Palindromem.");
                return false;
            }
        }
        System.out.println("Slowo: '" + userWord + "' jest Palindromem.");
        return true;
    }
}
