package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        /*Utworzenie obiektu klasy 'File'*/
        File file = new File("/home/popo/Documents/code/QA_TestJava/QA_TestJava/src/Files/test.txt");

        /*Utworzenie obiektu metody Scanner (reader) i jako argument podajemy nazwe obiektu w tym przypadku 'file'*/
        Scanner reader = new Scanner(file);

        /*Petla 'while' wykonuje metody 'hasNext()' i 'nextLine()' na obiekcie konstruktora (reader) i odczytuje plik*/
        while (reader.hasNext()) {
            String line = reader.nextLine();
            System.out.println(line);
        }
        reader.close();
    }
}
