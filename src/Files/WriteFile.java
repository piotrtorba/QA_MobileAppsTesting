package Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter zapis1 = new FileWriter("/home/popo/Documents/code/QA_TestJava/QA_TestJava/src/Files/test.txt");
        zapis1.write("Sample text in file.");
        zapis1.close();
    }
}
