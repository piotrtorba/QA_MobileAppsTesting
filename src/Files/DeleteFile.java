package Files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("/home/popo/Documents/code/QA_TestJava/QA_TestJava/src/Files/test.txt");

        /*Metoda delete()' jest typu 'boolen'. Zwraca 'True' gdy plik nie istnieje i usowa plik, oraz zwraca
        'False' gdy plik nie istnieje.*/
        if(file.delete()) {
            System.out.println("File deleted.");
        } else {
            System.out.println("There is no such a file.");
        }
    }
}
