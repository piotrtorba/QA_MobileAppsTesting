package Java_Course;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) {
        try {
            System.out.println("Loading file...");
            readFile("/home/popo/Documents/code/QA_TestJava/QA_TestJava/src/test.txt");
            System.out.println("Job done!");
        } catch (FileNotFoundException e) {
            System.out.println("Exception skipped");
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            System.out.println("Closing file...");
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
