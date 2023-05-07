package Files;

import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) throws IOException {
        File plik1 = new File("/home/popo/Documents/code/QA_TestJava/QA_TestJava/src/Files/test.txt");
        if(plik1.createNewFile()) {
            System.out.println("New file created.");
        } else {
            System.out.println("File already exists.");
        }
    }
}
