package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/popo/Documents/code/QA_TestJava/QA_TestJava/src/Files/test.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            String line = reader.nextLine();
            System.out.println(line);
        }
    }
}
