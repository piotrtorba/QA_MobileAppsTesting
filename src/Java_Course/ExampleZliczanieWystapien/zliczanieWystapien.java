package Java_Course.ExampleZliczanieWystapien;

import java.util.HashMap;
import java.util.Map;

public class zliczanieWystapien {
    // int[] numbers = new int[]{1,2,3,2,5,3};
    public static void main(String[] args) {

        policz(new int[]{1,2,3,2,5,3,3,3,2,6,7,10,10});
    }
    public static void policz(int[] numbers) {
        Map<Integer, Integer> wystapienia = new HashMap<>();
        for (int i=0; i<numbers.length; i++) {
            if (wystapienia.containsKey(numbers[i])) {
                Integer value = wystapienia.get(numbers[i]);
                wystapienia.put(numbers[i], value+1);
            } else {
                wystapienia.put(numbers[i], 1);
            }
        }
        System.out.println("Ilosc wystapien elementow w mapie to: " +wystapienia.size());
        for (Integer key : wystapienia.keySet()) {
            System.out.println("Liczba " + key + " wystepuje " + wystapienia.get(key));
        }
    }
}
