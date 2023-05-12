package Java_Course;

import java.util.stream.IntStream;

public class num1to100mod3 {
    public static void main(String[] args) {
        //Wypisz liczby z zakresu 1-100 ktore sa podzielna przez 3

        System.out.println("Liczby od 0 do 30 podzeilne przez 3 to:");
        IntStream.range(0,30).filter(i -> i%3==0).forEach(i -> {
            System.out.println(i);
        });
    }
}
