package Java_Course.Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        /*Utworzenie obiektu klasy 'FileWriter()'*/
        FileWriter zapis1 = new FileWriter("/home/popo/Documents/code/QA_TestJava/QA_TestJava/src/Files/test.txt");

        /*Metoda write("Jakis tekst") zapisuje tekst w pliku. Metoda close() zamyka plik.*/
        zapis1.write("Sample text in file.");
        zapis1.close();
    }
}
