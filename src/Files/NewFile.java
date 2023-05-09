package Files;

import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) throws IOException {
        /*Utworzenie obiektu klasy 'File'*/
        File plik1 = new File("/home/popo/Documents/code/QA_TestJava/QA_TestJava/src/Files/test.txt");

        /*Metoda 'createNewFile()' jest typu 'boolen'. Zwraca 'True' gdy plik nie istnieje i tworzy plik, oraz zwraca
        'False' gdy plik juz istnieje.*/
        if(plik1.createNewFile()) {
            System.out.println("New file created.");
        } else {
            System.out.println("File already exists.");
        }
    }
}
